package edu.hillel.hw6.testjs;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class HHCalcTest
{
	WebDriver driver=null;
	
	@Parameterized.Parameters
	public static Collection<Object[]> drivers()
	{
		return Arrays.asList(new Object[][]{
			//{ new FirefoxDriver(),"webdriver.chrome.driver", "d:/chromedriver.exe" }
			{ new ChromeDriver(),"webdriver.chrome.driver", "d:/chromedriver.exe"  }
		});
	}

	public HHCalcTest(WebDriver driver, String property, String exe) {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");this.driver=driver;
		
		//System.out.println("System.setProperty(\""+property+"\", \""+exe+"\"");
		//System.setProperty(property,exe);
	}
	
	@Test
	public void existTestMozilla()
	{
		//WebDriver driver = new FirefoxDriver();
		Boolean result=true;
		try {
			driver.get("file:///d:/Java/ex_calk.html");	
			driver.findElement(By.id("btn1"));
			driver.findElement(By.id("btn2"));
			driver.findElement(By.id("btn3"));
			driver.findElement(By.id("btn4"));
			driver.findElement(By.id("btn5"));
			driver.findElement(By.id("btn6"));
			driver.findElement(By.id("btn7"));
			driver.findElement(By.id("btn8"));
			driver.findElement(By.id("btn9"));
			driver.findElement(By.id("btn0"));
			driver.findElement(By.id("btnplus"));
			driver.findElement(By.id("btnminus"));
			driver.findElement(By.id("btnumnog"));
			driver.findElement(By.id("btncount"));
			driver.findElement(By.id("btndevide"));
			driver.findElement(By.id("action"));
		} catch (NoSuchElementException e) {
			System.out.println(e);
			result=false;
		}
		driver.quit();
		assertEquals(true, result);
	}

	@Test
	public void simpleCheckTestMozilla() 
	{
		WebDriver driver = new FirefoxDriver();
		String res;
		try {
			driver.get("file:///d:/Java/ex_calk.html");	
			driver.findElement(By.id("btn1")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("1", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn2")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("2", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn3")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("3", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn4")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("4", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn5")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("5", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn6")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("6", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn7")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("7", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn8")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("8", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn9")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("9", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btn0")).click();
			res = driver.findElement(By.id("txt1")).getAttribute("value");
			assertEquals("0", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btnplus")).click();
			res = driver.findElement(By.id("action")).getAttribute("value");
			assertEquals("+", res);
			driver.findElement(By.id("txt1")).clear();

			driver.findElement(By.id("btnminus")).click();
			res = driver.findElement(By.id("action")).getAttribute("value");
			assertEquals("-", res);

			driver.findElement(By.id("btnumnog")).click();
			res = driver.findElement(By.id("action")).getAttribute("value");
			assertEquals("*", res);

			driver.findElement(By.id("btncount")).click();
			res = driver.findElement(By.id("action")).getAttribute("value");
			assertEquals("=", res);

			driver.findElement(By.id("btndevide")).click();
			res = driver.findElement(By.id("action")).getAttribute("value");
			assertEquals("/", res);

		} catch (NoSuchElementException e) {
			System.out.println(e);
			driver.quit();
		}
		driver.quit();
	}	

	@Test
	public void testPlusMozilla() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnplus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("108", res);
		driver.quit();
	}

	@Test
	public void testMinusMozilla() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnminus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("-84", res);
		driver.quit();
	}

	@Test
	public void testUmnogMozilla() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnumnog")).click();
		driver.findElement(By.id("btn5")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("60", res);
		driver.quit();
	}

	@Test
	public void testDevideMozilla() 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btndevide")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("3", res);
		driver.quit();
	}
	/*
	@Test
	public void testPlusChrome() 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnplus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("108", res);
		driver.quit();
	}
	@Test
	public void testMinusChrome() 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnminus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("-84", res);
		driver.quit();
	}
	@Test
	public void testUmnogChrome() 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnumnog")).click();
		driver.findElement(By.id("btn5")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("60", res);
		driver.quit();
	}
	@Test
	public void testDevideChrome() 
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btndevide")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("3", res);
		driver.quit();
	}

	@Test
	public void testPlusOpera() 
	{
		System.setProperty("webdriver.opera.driver", "d:/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnplus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("108", res);
		driver.quit();

	}
	@Test
	public void testMinusOpera() 
	{
		System.setProperty("webdriver.opera.driver", "d:/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnminus")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn6")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("-84", res);
		driver.quit();
	}
	@Test
	public void testUmnogOpera() 
	{
		System.setProperty("webdriver.opera.driver", "d:/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("btnumnog")).click();
		driver.findElement(By.id("btn5")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("60", res);
		driver.quit();
	}
	@Test
	public void testDevideOpera() 
	{
		System.setProperty("webdriver.opera.driver", "d:/operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("file:///d:/Java/ex_calk.html");	
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btn9")).click();
		driver.findElement(By.id("btndevide")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btncount")).click();
		String res = driver.findElement(By.id("txt1")).getAttribute("value");
		assertEquals("3", res);
		driver.quit();
	}
	 */
}

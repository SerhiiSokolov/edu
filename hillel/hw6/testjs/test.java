package edu.hillel.hw6.testjs;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class test {

	WebDriver driver;
	private WebDriver browser;

	public test(WebDriver browser){
		this.browser = browser;
	}

	@Parameters
	public static Collection<Object[] > data(){
		Object[][] data = new Object[][] { 
			//{ new ChromeDriver() }
		  { new FirefoxDriver() }
			};
		return Arrays.asList(data);
	}

	@Before
	public void setUp(){
		driver = browser;
	}

	@After
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void testFindElements() throws Exception{
		driver.get("http://www.google.com");
		Thread.sleep(500);
		WebElement searchArea = driver.findElement(By.name("q"));
		searchArea.sendKeys("JUnit");
		Thread.sleep(500);
		WebElement searchButton = driver.findElement(By.name("btnG"));
		searchButton.click();
		Thread.sleep(500);
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("JUnit"));
		Thread.sleep(1000);
	}
}
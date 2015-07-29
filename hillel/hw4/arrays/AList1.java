package edu.hillel.hw4.arrays;

public class AList1 implements EList {

	private int[] arr = new int[10];
	private int index=0;
	@Override
	public int size()
	{
		return index;
	}

	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
			index=0;
		}
		index=ini.length;
		if (index>arr.length) resize((int)(index*2));
		for (int i = 0; i < ini.length; i++) 
		{
			arr[i] = ini[i];
		}
		
	}

	@Override
	public void clear()
	{
		init(null);
	}

	@Override
	public int[] toArray() 
	{
		int[] tmp = new int[index];
		for (int i = 0; i < index; i++) 
		{
			tmp[i] = arr[i];
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{
		return arr[pos];
	}

	@Override
	public void set(int pos, int val) 
	{
		arr[pos] = val;
	}


	@Override
	public void addStart(int val)
	{
		index++;
		if (index>arr.length) resize();
		int[] tmp = new int[arr.length+1];
		tmp[0] = val;
		for (int i = 0; i < arr.length; i++) 
		{
			tmp[i+1] = arr[i];
		}
		arr = tmp;
	}

	@Override
	public void addEnd(int val)
	{
		int[] tmp = new int[arr.length+1];
		for (int i = 0; i < arr.length; i++) 
		{
			tmp[i] = arr[i];
		}
		tmp[arr.length] = val;
		arr = tmp;
	}

	@Override
	public void addPos(int pos, int val)
	{
		int[] tmp = new int[arr.length+1];
		for (int i = 0; i < pos; i++) 
		{
			tmp[i] = arr[i];
		}
		for (int i = pos; i < arr.length; i++) 
		{
			tmp[i+1] = arr[i];
		}
		tmp[pos] = val;
		arr = tmp;
	}

	@Override
	public int delStart()
	{
		if(size() == 0)
			throw new IllegalArgumentException();

		int ret = arr[0];
		int[] tmp = new int[arr.length-1];
		for (int i = 1; i < arr.length; i++) 
		{
			tmp[i-1] = arr[i];
		}
		arr = tmp;
		index--;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new IllegalArgumentException();

		int ret = arr[arr.length-1];
		int[] tmp = new int[arr.length-1];
		for (int i = 0; i < arr.length-1; i++) 
		{
			tmp[i] = arr[i];
		}
		arr = tmp;
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		int ret = arr[pos];
		int[] tmp = new int[arr.length-1];

		for (int i = 0; i < pos; i++) 
		{
			tmp[i] = arr[i];
		}
		for (int i = pos+1; i < arr.length; i++) 
		{
			tmp[i-1] = arr[i];
		}
		arr = tmp;
		return ret;
	}

	@Override
	public int min()
	{
		int min = arr[0];
		for (int i=0; i < arr.length; i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	@Override
	public int max()
	{
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}

	@Override
	public int minInd()
	{
		int min = 0;
		for (int i=0; i < arr.length; i++)
		{
			if (arr[min] > arr[i])
			{
				min = i;
			}
		}
		return min;
	}

	@Override
	public int maxInd()
	{
		int max = 0;
		for (int i=0; i < arr.length; i++)
		{
			if (arr[max] < arr[i])
			{
				max = i;
			}
		}
		return max;
	}

	@Override
	public void sort()
	{
		for(int i = index-1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( arr[j] > arr[j+1] )
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public void reverse()
	{
		for (int i=0; i < index/2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[index-1-i];
			arr[index-1-i] = tmp;
		}
	}

	@Override
	public void halfReverse()
	{	
		int d = (index%2==0)?0:1;
		for (int i=0; i < (index)/2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[index/2+d+i];
			arr[index/2+d+i] = tmp;
		}
	}
	private void resize()
	{
		int newSize=arr.length+arr.length/3;
		int[] tmp=new int[newSize];
		for(int i=0; i<newSize;i++)
		{
			tmp[i]=arr[i];
		}
		arr=tmp;
	}
	private void resize(int newSize)
	{
		int[] tmp=new int[newSize];
		System.out.println("new arr size="+tmp.length);
		for(int i=0; i<newSize/2-1;i++)
		{
			System.out.println("i="+i);
			tmp[i]=arr[i];
		}
		arr=tmp;
		System.out.println("new arr size="+arr.length);
	}
}

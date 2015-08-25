package edu.hillel.hw5.llist;

import java.util.Iterator;

public class AList2 implements EList {


	private int[] arr = new int[10];
	private int start=arr.length/2;
	private int end=start;

	@Override
	public int size()
	{
		return end-start;
	}

	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
			start=arr.length/2;
			end=start;
		}

		if (ini.length>arr.length) resize((int)(ini.length*1.3));

		start=arr.length/2-ini.length/2;
		end=start+ini.length;

		for (int i = start; i < start+ini.length; i++) 
		{
			arr[i] = ini[i-start];
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
		int[] tmp = new int[end-start];
		for (int i = start; i < end; i++) 
		{
			tmp[i-start] = arr[i];
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{	
		if(size() == 0||pos<0||pos>=size())
			throw new ListIsEmptyException();

		return arr[start+pos];
	}

	@Override
	public void set(int pos, int val) 
	{

		if(size() == 0||(start+pos)<start||(start+pos)>end)
			throw new ListIsEmptyException();

		arr[start+pos] = val;
	}

	@Override
	public void addStart(int val)
	{
		resize();
		arr[--start]=val;
	}

	@Override
	public void addEnd(int val)
	{	
		resize();
		arr[end++]=val;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if (start+pos>end)
			throw new ListIsEmptyException();

		resize();
		for (int i = end; i > pos+start; i--) 
		{
			arr[i] = arr[i-1];
		}
		arr[pos+start] = val;
		end++;
	}

	@Override
	public int delStart()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int ret = arr[0];
		arr[start]=0;
		start++;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		end--;
		int ret = arr[end];
		arr[end]=0;
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		int realPos=pos+start;
		if(size() == 0||realPos<start||pos>end)
			throw new ListIsEmptyException();
		int ret = arr[realPos];

		for(int i=realPos;i<end;i++)
		{
			arr[i]=arr[i+1];
		}
		end--;
		return ret;
	}

	@Override
	public int min()
	{
		if(size()==0) 
			throw new ListIsEmptyException();
		int min = arr[start];
		for (int i=start; i < end; i++)
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
		if(size() == 0)
			throw new ListIsEmptyException();
		int max = arr[start];
		for (int i = start; i < end; i++)
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
		if(size() == 0)
			throw new ListIsEmptyException();
		int min = start;
		for (int i=start; i < end ; i++)
		{
			if (arr[min] > arr[i])
			{
				min = i;
			}

		}
		return min-start;
	}

	@Override
	public int maxInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int max = start;
		for (int i=start+1; i < end; i++)
		{
			if (arr[max] < arr[i])
			{
				max = i;
			}
		}
		return max-start;
	}

	@Override
	public void sort()
	{
		for(int i = end-1 ; i > 0 ; i--)
		{
			for(int j = start ; j < i ; j++)
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
		for(int i=0;i<size()/2;i++)
		{
			int tmp=arr[i+start];
			arr[i+start]=arr[end-i-1];
			arr[end-i-1]=tmp;
		}
	}

	@Override
	public void halfReverse()
	{	
		int d = (size()%2==0)?0:1;
		for(int i=start;i<start+size()/2;i++)
		{
			int tmp=arr[i];
			arr[i]=arr[size()/2+i+d];
			arr[size()/2+i+d]=tmp;
		}
	}

	private void resize()
	{
		if(start==0||end==arr.length)
		{
			int newSize=arr.length+arr.length/3;
			int[] tmp=new int[newSize];
			int j=(tmp.length-arr.length)/2;

			for(int i=start; i<end;i++, j++)
			{
				tmp[j]=arr[i];
			}
			start=(tmp.length-arr.length)/2;
			end=j;
			arr=tmp;
		}
	}

	private void resize(int newSize)
	{
		int[] tmp=new int[newSize];
		for(int i=0; i<arr.length;i++)
		{
			tmp[i]=arr[i];
		}
		arr=tmp;
	}

	@Override
	public Iterator<Integer> iterator() 
	{
		return new AIter();
	}

	class AIter implements Iterator<Integer>
	{
		int index=start;

		@Override
		public boolean hasNext() 
		{
			return index<end;
		}

		@Override
		public Integer next() 
		{
			return arr[index++];
		}
		
	}
}

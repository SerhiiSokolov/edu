package edu.hillel.hw5.llist;

public class AListR implements EList {


	private int[] arr = new int[10];
	private int start=arr.length/2;
	private int end=start;

	@Override
	public int size()
	{
		int count;
		if(start>=end)
		{
			count=arr.length-start+end;
		}
		else
		{
			count=end-start;
		}
		return count;
	}

	@Override
	public void init(int[] ini)
	{
		{
			if(ini == null)
			{
				ini = new int[0];
			}

			if (ini.length>arr.length) resize((int)(ini.length*1.3));

			start=arr.length/2-ini.length/2;
			end=start+ini.length;
			for (int i = start; i < start+ini.length; i++) 
			{
				arr[i] = ini[i-start];
			}
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
		int[] tmp = new int[size()];
		if (start>=end)
		{
			int j=0;		
			for(int i=start;j<size();i++,j++)
			{
				if(i==arr.length) i=0;
				tmp[j]=arr[i];
			}
		}
		else
		{			
			for (int i = start; i < end; i++) 
			{
				tmp[i-start] = arr[i];
			}
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{	
		if(size() == 0||pos>size()||pos<0)
			throw new ListIsEmptyException();

		int realPos;

		if (pos>=arr.length-start)
		{
			realPos=(pos-(arr.length-start));
		}
		else
		{
			realPos=start+pos;
		}
		return arr[realPos];
	}

	@Override
	public void set(int pos, int val) 
	{
		if(size() == 0||pos>size()||pos<0)
			throw new ListIsEmptyException();

		int realPos;
		if (pos>=arr.length-start)
		{
			realPos=(pos-(arr.length-start));
		}
		else
		{
			realPos=start+pos;
		}
		arr[realPos] = val;
	}

	@Override
	public void addStart(int val)
	{
		resize();
		if (start==0) start=arr.length;
		arr[--start]=val;
	}

	@Override
	public void addEnd(int val)
	{	
		resize();
		if (end==arr.length) end=0;
		arr[end++]=val;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if (pos>size())
			throw new ListIsEmptyException();

		resize();
		if(pos==0) addStart(val);
		else if(pos==size()) addEnd(val);		
		else
		{
			addEnd(get(size()-1));
			for(int j=size()-2;j>pos;j--)
			{
				set(j,get(j-1));
			}
			set(pos,val);
		}
	}

	@Override
	public int delStart()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int ret = arr[start];
		arr[start]=0;
		start++;
		if(start==arr.length) start=0;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		end--;
		if(end<0) end=arr.length-1;
		int ret = arr[end];
		arr[end]=0;		
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		int[] tmp=toArray();

		if(size() == 0||pos<0||pos>tmp.length-1)
			throw new ListIsEmptyException();
		int ret=tmp[pos];

		for(int i=pos;i<tmp.length-1;i++)
		{
			tmp[i]=tmp[i+1];
		}



		arr[end]=0;
		end--;
		if(end<0) end=arr.length-1;


		return ret;
	}

	@Override
	public int min()
	{
		if(size()==0) 
			throw new ListIsEmptyException();

		int min = arr[start];
		for (int i=start+1;i!=end; i++)
		{
			if(i==arr.length) i=0;
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
		if(size()==0) 
			throw new ListIsEmptyException();

		int max = arr[start];
		for (int i=start+1;i!=end; i++)
		{
			if(i==arr.length) i=0;
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
		for (int i=start, j=0;j < size(); i++,j++)
		{
			if(i==arr.length) i=0;
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
		int max = 0;
		for (int i=start, j=0;j < size(); i++,j++)
		{
			if(i==arr.length) i=0;
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
		int[] tmpArr=toArray();
		for(int i = tmpArr.length-1 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( tmpArr[j] > tmpArr[j+1] )
				{
					int tmp = tmpArr[j];
					tmpArr[j] = tmpArr[j+1];
					tmpArr[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public void reverse()
	{
		int[] tmpArr=toArray();
		for (int i=0; i < tmpArr.length/2; i++)
		{
			int tmp = tmpArr[i];
			tmpArr[i] = tmpArr[tmpArr.length-1-i];
			tmpArr[tmpArr.length-1-i] = tmp;
		}
	}

	@Override
	public void halfReverse()
	{	
		int[] tmpArr=toArray();
		int d = (tmpArr.length%2==0)?0:1;
		for (int i=0; i < (tmpArr.length)/2; i++)
		{
			int tmp = tmpArr[i];
			tmpArr[i] = tmpArr[(tmpArr.length)/2+d+i];
			tmpArr[(tmpArr.length)/2+d+i] = tmp;
		}
	}

	private void resize()
	{	
		if(size()==arr.length)
		{
			int[] tmpNewArr=new int[arr.length+arr.length/3];
			int[] tmpOldArr=toArray();
			int j=tmpNewArr.length/2-size()/2;

			for(int i=0;i<size();i++,j++)
			{
				tmpNewArr[j]=tmpOldArr[i];
			}

			start=(tmpNewArr.length-arr.length)/2;
			end=j;
			arr=tmpNewArr;
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

	public void printArray()
	{
		if(arr==null) throw new ListIsEmptyException();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("["+arr[i]+"] ");
		}
		System.out.println();
	}
}

package edu.hillel.hw5.llist;

public class AListR implements EList {


	private int[] arr = new int[10];
	private int start=0;
	private int end=arr.length;
	private int middle=arr.length/2;
	private int count=0;

	@Override
	public int size()
	{
		return count;
	}

	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
			start=end=0;
			count=0;
		}
		if (ini.length>arr.length) resize((int)(ini.length*1.3));
		start=middle-ini.length/2;
		end=start+ini.length-1;
		for (int i = start; i <= end; i++) 
		{
			arr[i] = ini[i-start];
			count++;
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
		int[] tmp = new int[count];
		if (start>end)
		{
			int j=0;
			for(int i=start;i<arr.length;i++,j++)
			{
				tmp[j]=arr[i];
			}
			for(int i=0;i<=end;i++,j++)
			{
				tmp[j]=arr[i];
			}
		}
		else
		{
			for (int i = start; i <= end; i++) 
			{
				tmp[i-start] = arr[i];
			}
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{	
		if(size() == 0||pos>count||pos<0)
			throw new ListIsEmptyException();
		int realPos=0;

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
		if(size() == 0||pos>count||pos<0)
			throw new ListIsEmptyException();
		int realPos=0;
		if (pos>=arr.length-start)
		{
			realPos=(pos-(arr.length-start));
		}
		else
		{
			realPos=start+pos;
		}
		System.out.println("realpos="+realPos);
		arr[realPos] = val;
	}

	@Override
	public void addStart(int val)
	{
		if (arr.length-count==0) resize();
		if (start==0) start=arr.length;
		start--;
		arr[start]=val;
		count++;
	}

	@Override
	public void addEnd(int val)
	{	
		if (arr.length-count==0) resize();
		if (end==arr.length-1) end=-1;
		end++;
		arr[end]=val;
		count++;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if (pos>count)
			throw new ListIsEmptyException();
		if (arr.length-count==0) resize();
		
		if(pos==0) addStart(val);
		else if(pos==count-1) addEnd(val);
		else
		{
			addEnd(arr[end]);
			int[] tmp=new int[count-(pos+1)];
			tmp[0]=val;

			for(int i=pos,j=1;i<count-2;i++,j++){
				System.out.println("i="+(i));
				tmp[j]=get(i);
			}

			for(int i=0;i<tmp.length;i++){
				System.out.println("pos+i="+(pos+i));
				set(pos+i,tmp[i]);
			}
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
		count--;
		if(start==arr.length) start=0;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int ret = arr[end];
		arr[end]=0;
		end--;
		count--;
		if(end<0) end=arr.length-1;
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
		int max = 0;
		for (int i=start; i < end; i++)
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
		int first=start;
		int last=end-1;
		while(last>first)
		{
			int tmp = arr[first];
			arr[first] = arr[last];
			arr[last] = tmp;
			first++;
			last--;
		}
	}

	@Override
	public void halfReverse()
	{	
		int d = (size()%2==0)?0:1;
		int first=start;
		int last=(start+end)/2+d;
		while(last<end)
		{
			int tmp=arr[first];
			arr[first]=arr[last];
			arr[last]=tmp;
			first++;
			last++;
		}
	}

	private void resize()
	{		
		int newSize=arr.length+arr.length/3;
		middle=newSize/2;
		int[] tmp=new int[newSize];
		int j=(tmp.length-arr.length)/2;
		if(start>end)
		{
			for(int i=start;i<arr.length;i++,j++)
			{
				tmp[j]=arr[i];
			}
			for(int i=0;i<=end;i++,j++)
			{
				tmp[j]=arr[i];
			}
			start=(tmp.length-arr.length)/2;
			end=j-1;
			arr=tmp;
		}
		else
		{
			for(int i=start; i<end;i++, j++)
			{
				tmp[j]=arr[i];
			}
			start=(tmp.length-arr.length)/2;
			end=j-1;
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
		middle=arr.length/2;
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

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
		if (count==0) ;
		else if (start>end)
		{
			int j=0;		
			for(int i=start;j<count;i++,j++)
			{
				if(i==arr.length) i=0;
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
		else if(pos==count) addEnd(val);		
		else if(start<end)
		{
			for (int i = end+1; i >pos+start; i--) 
			{
				arr[i] = arr[i-1];
			}
			arr[pos+start] = val;
			end++;
			count++;
		}
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
		int[] tmp=toArray();
				
		if(size() == 0||pos<0||pos>tmp.length-1)
			throw new ListIsEmptyException();
		int ret=tmp[pos];
		
		for(int i=pos;i<tmp.length-1;i++)
		{
			tmp[i]=tmp[i+1];
		}
		
		backArray(tmp);
		
		arr[end]=0;
		end--;
		if(end<0) end=arr.length-1;
		count--;
		
		return ret;
	}

	@Override
	public int min()
	{
		if(size()==0) 
			throw new ListIsEmptyException();
		int min = arr[start];
		for (int i=start, j=0;j < count; i++,j++)
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
		if(size() == 0)
			throw new ListIsEmptyException();
		int max = arr[start];
		for (int i=start, j=0;j < count; i++,j++)
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
		for (int i=start, j=0;j < count; i++,j++)
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
		for (int i=start, j=0;j < count; i++,j++)
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
		backArray(tmpArr);
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
		backArray(tmpArr);
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
		backArray(tmpArr);
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
	
	private void backArray(int[] tmp)
	{
		int i=start;
		for(int j=0;j<tmp.length;i++,j++)
		{
			if(i==arr.length) i=0;
			arr[i]=tmp[j];
		}
	}
}

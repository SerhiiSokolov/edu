package edu.hillel.hw5.llist;

public class AListR implements EList {


	private int[] arr = new int[5];
	private int start=arr.length/2;
	private int end=start;

	@Override
	public int size()
	{
		int count;
		if(start>end)
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

			if (ini.length>arr.length) arr=new int[(int)(ini.length*1.3)];

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
		if(size() == 0||pos>=size()||pos<0)
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
		if(size() == 0||pos>=size()||pos<0)
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
		if(++start==arr.length) start=0;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		if(--end<0) end=arr.length-1;
		int ret = arr[end];
		arr[end]=0;		
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		if(size() == 0||pos<0||pos>size()-1)
			throw new ListIsEmptyException();

		int ret=get(pos);
		if(pos==0) delStart();
		else if(pos==size()-1) delEnd();
		else
		{
			for(int j=pos;j<size()-1;j++)
			{
				set(j,get(j+1));
			}
			if(--end<0) end=arr.length-1;
		}
		return ret;
	}

	@Override
	public int min()
	{
		if(size()==0) 
			throw new ListIsEmptyException();

		int min=get(0);
		for(int i=0;i<size();i++)
		{
			if (get(i)<min) min=get(i);
		}
		return min;
	}

	@Override
	public int max()
	{
		if(size()==0) 
			throw new ListIsEmptyException();

		int max=get(0);
		for(int i=0;i<size();i++)
		{
			if (get(i)>max) max=get(i);
		}
		return max;
	}

	@Override
	public int minInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int ind=0;
		for (int i=1;i<size(); i++)
		{
			if (get(ind) > get(i))
			{
				ind = i;
			}
		}
		return ind;
	}

	@Override
	public int maxInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int ind=0;
		for (int i=1;i<size(); i++)
		{
			if (get(ind) < get(i))
			{
				ind = i;
			}
		}
		return ind;
	}

	@Override
	public void sort()
	{
		for(int i = size()-1; i > 0 ; i--)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if( get(j) > get(j+1) )
				{
					int tmp = get(j);
					set(j,get(j+1));
					set(j+1,tmp);
				}
			}
		}
	}

	@Override
	public void reverse()
	{
		for (int i=0; i < size()/2; i++)
		{
			int tmp = get(i);
			set(i,get(size()-i-1));
			set(size()-i-1,tmp);
		}
	}

	@Override
	public void halfReverse()
	{	
		int d = (size()%2==0)?0:1;
		for (int i=0; i < size()/2; i++)
		{
			int tmp=get(i);
			set(i,get(size()/2+d+i));
			set(size()/2+d+i,tmp);
		}
	}

	private void resize()
	{	
		if(size()==arr.length-1||start-end==1)
		{
			int[] tmp=new int[arr.length+arr.length/3];
			int j=tmp.length/2-size()/2;			
			for(int i=0;i<size();i++,j++)
			{
				tmp[j]=get(i);
			}

			start=tmp.length/2-size()/2;
			end=j;
			arr=tmp;
		}
	}
}

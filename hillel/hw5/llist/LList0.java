package edu.hillel.hw5.llist;

public class LList0 implements EList
{
	private int[] arr = {};
	Node root=new Node();

	@Override
	public int size()
	{
		int count=0;
		if(root.getNext()==null) count=0;
		else
		{
			Node node=new Node();
			node.setNext(root.getNext());
			do
			{
				node=node.getNext();
				count++;
			}while(node.getNext()!=null);
		}
		return count;
	}

	@Override
	public void init(int[] ini)
	{	
		if(ini==null||ini.length==0)
		{
			//Nothing to do
		}

		else
		{
			root.setNext(new Node());

			Node next=root.getNext();
			next.setData(ini[0]);
			for(int i=1;i<ini.length;i++)
			{
				Node tempNext=next;
				next=new Node();
				next.setData(ini[i]);
				tempNext.setNext(next);
			}
		}
	}

	public void clear()
	{
		root.setNext(null);;
	}

	@Override
	public int[] toArray() 
	{

		Node node=new Node();
		node.setNext(root.getNext());
		int[] tmp = new int[size()];
		for (int i = 0; i < tmp.length; i++) 
		{
			node=node.getNext();	
			tmp[i] = node.getData();
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{
		if(size() == 0||pos<0||pos>size())
			throw new IllegalArgumentException();
		int i=-1;
		Node node=new Node();
		node.setNext(root.getNext());
		do
		{
			i++;
			node=node.getNext();
		}while(i!=pos);
				
		return node.getData();
	}

	@Override
	public void set(int pos, int val) 
	{
		if(size() == 0||pos<0||pos>arr.length)
			throw new IllegalArgumentException();
		arr[pos] = val;
	}

	@Override
	public void addStart(int val)
	{
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
			throw new ListIsEmptyException();

		int ret = arr[0];
		int[] tmp = new int[arr.length-1];
		for (int i = 1; i < arr.length; i++) 
		{
			tmp[i-1] = arr[i];
		}
		arr = tmp;
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
		if(size() == 0||pos<0||pos>arr.length)
			throw new IllegalArgumentException();
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
		if(size() == 0)
			throw new IllegalArgumentException();
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
		if(size() == 0)
			throw new IllegalArgumentException();
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
		if(size() == 0)
			throw new IllegalArgumentException();
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
		if(size() == 0)
			throw new IllegalArgumentException();
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
		for(int i = arr.length-1 ; i > 0 ; i--)
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
		for (int i=0; i < arr.length/2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = tmp;
		}
	}

	@Override
	public void halfReverse()
	{	
		int d = (arr.length%2==0)?0:1;
		for (int i=0; i < (arr.length)/2; i++)
		{
			int tmp = arr[i];
			arr[i] = arr[(arr.length)/2+d+i];
			arr[(arr.length)/2+d+i] = tmp;
		}
	}
	
	@Override 
	public String toString()
	{
		String s="";
		Node node=new Node();
		node.setNext(root.getNext());
		do
		{
			node=node.getNext();
			s=s+node.getData()+", ";
		}while(node.getNext()!=null);
		return s;
	}
}

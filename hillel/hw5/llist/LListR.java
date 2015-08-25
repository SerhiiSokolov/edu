package edu.hillel.hw5.llist;

import java.util.Iterator;

public class LListR implements EList, Iterable<Integer>
{
	public class Node2
	{
		int data;
		Node2 next;
		Node2 prev;
		Node2(int data)
		{
			this.data=data;
		}
	}

	Node2 root=null;

	@Override
	public int size()
	{		
		int count=0;
		if(root==null) count=0;
		else
		{
			Node2 tmp=root;
			do
			{
				tmp=tmp.next;
				count++;
			}while(tmp!=root);
		}
		return count;
	}

	@Override
	public void init(int[] ini)
	{	
		if(ini==null||ini.length==0)
		{
			root=null;			
		}
		else
		{
			for(int i=ini.length-1;i>=0;i--)
			{
				addStart(ini[i]);
			}
		}
	}

	public void clear()
	{
		root=null;
	}

	@Override
	public int[] toArray() 
	{
		Node2 tmp=root;
		int[] arr = new int[size()];
		for (int i = 0; i < size(); i++) 
		{
			arr[i] = tmp.data;
			tmp=tmp.next;
		}
		return arr;
	}

	@Override
	public int get(int pos) 
	{
		if(size() == 0||pos<0||pos>size()-1)
			throw new ListIsEmptyException();

		int i=0;		
		Node2 tmp=root;
		while(i!=pos)
		{	
			tmp=tmp.next;
			i++;
		}

		return tmp.data;
	}

	@Override
	public void set(int pos, int val) 
	{
		if(size() == 0||pos<0||pos>=size())
			throw new ListIsEmptyException();

		int i=0;
		Node2 tmp=root;
		while(i<pos)
		{
			tmp=tmp.next;
			i++;
		}
		tmp.data=val;
	}

	@Override
	public void addStart(int val)
	{
		Node2 tmp=new Node2(val);
		if (root==null)
		{
			root=tmp;
			tmp.next=tmp;
			tmp.prev=tmp;
		}	
		else
		{
			tmp.next=root;
			tmp.prev=root.prev;
			root.prev.next=tmp;
			root.prev=tmp;
			root=tmp;
		}
	}

	@Override
	public void addEnd(int val)
	{
		Node2 tmp=new Node2(val);
		if (root==null)
		{
			root=tmp;
			tmp.next=tmp;
			tmp.prev=tmp;
		}	
		else
		{
			tmp.next=root;
			tmp.prev=root.prev;
			root.prev.next=tmp;
			root.prev=tmp;
		}
	}

	@Override
	public void addPos(int pos, int val)
	{
		if(pos<0||pos>size())
			throw new ListIsEmptyException();

		Node2 node=new Node2(val);

		if(pos==0) addStart(val);
		else if(pos==size()) addEnd(val);

		else
		{
			Node2 tmp=root;

			int i=0;
			while(i<pos-1)
			{
				i++;
				tmp=tmp.next;
			}
			tmp.next.prev=node;
			node.next=tmp.next;
			tmp.next=node;
			node.prev=tmp;
		}
	}

	@Override
	public int delStart()
	{		
		if(size() == 0)
			throw new ListIsEmptyException();

		int ret=root.data;
		if (size()==1)
		{
			clear();
		}
		else
		{
			Node2 second=root.next;
			Node2 last=root.prev;

			second.prev=last;
			last.next=second;
			root=second;
		}
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int ret;
		if (size()==1)
		{
			ret=root.data;
			clear();
		}
		else
		{

			Node2 last=root.prev;
			ret=last.data;

			last=last.prev;
			last.next=root;
			root.prev=last;			
		}
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		if(size()==0||pos<0||pos>size()-1)
			throw new ListIsEmptyException();

		int ret=0;		
		if(size()==1) 
		{
			ret=root.data;	
			clear();
		}
		else if(pos==0) ret=delStart();
		else if(pos==size()-1) ret=delEnd();
		else
		{
			int count=0;
			Node2 tmp=root;
			while(count<pos)
			{
				tmp=tmp.next;
				count++;
			}
			ret=tmp.data;
			tmp.prev.next=tmp.next;
			tmp.next.prev=tmp.prev;
		}
		return ret;
	}

	@Override
	public int min()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int min=0;
		if(size()==1) min=root.data;
		else
		{
			min= root.data;
			Node2 tmp=root.next;
			do 
			{
				if (tmp.data<min) min=tmp.data;
				tmp=tmp.next;
			}while(tmp!=root);
		}
		return min;
	}

	@Override
	public int max()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int max =0;
		if(size()==1) max=root.data;
		else
		{
			max=root.data;
			Node2 tmp=root.next;
			do
			{
				if (tmp.data>max) max=tmp.data;
				tmp=tmp.next;			
			}while(tmp!=root);
		}
		return max;
	}

	@Override
	public int minInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int minInd=0;
		if(size()==1) minInd=0;
		else
		{
			int index=1;
			int min=root.data;
			Node2 tmp=root.next;
			do
			{
				if(tmp.data<min)
				{
					min=tmp.data;
					minInd=index;
				}
				index++;
				tmp=tmp.next;
			}while (tmp!=root);
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int maxInd=0;
		if(size()==1) maxInd=0;
		else
		{
			int index=1;
			int max=root.data;
			Node2 tmp=root.next;

			do
			{
				if(tmp.data>max)
				{
					max=tmp.data;
					maxInd=index;
				}
				index++;
				tmp=tmp.next;
			}while (tmp!=root);
		}
		return maxInd;
	}

	@Override
	public void sort()
	{
		if(size()<=1) return;

		Node2 out=null;
		Node2 tmp;
		while(root!=null)
		{
			Node2 max = root;
			tmp=root.next;
			while(tmp!=root)
			{
				if(max.data<tmp.data)
				{
					max=tmp;
				}
				tmp=tmp.next;
			}
			root=max;
			delStart();
			if (out==null)
			{
				out=max;
				max.next=max;
				max.prev=max;
			}	
			else
			{
				max.next=out;
				max.prev=out.prev;
				out.prev.next=max;
				out.prev=max;
				out=max;
			}			
		}
		root=out;
	}


	@Override
	public void reverse()
	{
		if(size()<=1) return;
		root=root.prev;
		Node2 tmp=root;
		Node2 temp;
		do
		{
			temp=tmp;
			tmp.next=tmp.prev;
			tmp.prev=temp;
			tmp=tmp.next;
		}while(tmp!=root);	
	}

	@Override
	public void halfReverse()
	{	
		
	}
	@Override
	public Iterator<Integer> iterator() 
	{
		return new LIter(toArray());
	}
	
	class LIter implements Iterator<Integer>
	{
		int index=0;
		int[] array;
		
		public LIter(int[] array) 
		{
			this.array=array;
		}

		@Override
		public boolean hasNext()
		{
			return index<array.length;
		}

		@Override
		public Integer next() {
			return array[index++];
		}		
	}
}

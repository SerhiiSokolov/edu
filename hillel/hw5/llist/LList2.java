package edu.hillel.hw5.llist;

import edu.hillel.hw5.llist.LList1.Node;

public class LList2 implements EList
{
	Node2 root=null;
	@Override
	public int size()
	{
		int count=0;
		Node2 tmp=root;
		while(tmp!=null)
		{
			tmp=tmp.next;
			count++;
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
		if(size() == 0||pos<0||pos>=size())
			throw new ListIsEmptyException();
		Node2 tmp=root;
		int i=0;
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
		}	
		else
		{
			root.prev=tmp;
			tmp.next=root;
			root=tmp;
		}
	}

	@Override
	public void addEnd(int val)
	{		
		Node2 node=new Node2(val);
		if (root==null)
		{
			root=node;
		}	
		else
		{
			Node2 tmp=root;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.next=node;
			node.prev=tmp;
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

		int ret = root.data;
		if (size()==1)
		{			
			clear();
		}
		else
		{
			ret=root.data;
			root=root.next;
			root.prev=null;
		}
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int ret=0;
		if(size()==1) 
		{
			ret=root.data;	
			clear();
		}
		else
		{
			Node2 tmp=root;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			ret=tmp.data;			
			tmp.prev.next=null;
			tmp.prev=null;
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
		int min = root.data;
		Node2 tmp=root.next;
		while(tmp!=null)
		{
			if (tmp.data<min) min=tmp.data;
			tmp=tmp.next;
		}
		return min;
	}

	@Override
	public int max()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int max = root.data;
		Node2 tmp=root.next;
		while(tmp!=null)
		{
			if (tmp.data>max) max=tmp.data;
			tmp=tmp.next;			
		}
		return max;
	}

	@Override
	public int minInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int minInd=0;
		int index=1;
		int min=root.data;
		Node2 tmp=root.next;

		while (tmp!=null)
		{
			if(tmp.data<min)
			{
				min=tmp.data;
				minInd=index;
			}
			index++;
			tmp=tmp.next;
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();

		int maxInd=0;
		int index=1;
		int max=root.data;
		Node2 tmp=root.next;

		while (tmp!=null)
		{
			if(tmp.data>max)
			{
				max=tmp.data;
				maxInd=index;
			}
			index++;
			tmp=tmp.next;
		}
		return maxInd;
	}

	@Override
	public void sort()
	{
		Node2 tmp;
		Node2 out=null;
		Node2 p;
		Node2 pr;
		while(root!=null)
		{
			tmp=root;
			root=root.next;
			for(p=out,pr=null;p!=null&&tmp.data>p.data;p=p.next)
			{
				pr=p;
			}
			if(pr==null)
			{
				tmp.next=out;
				if(out!=null) out.prev=tmp;
				out=tmp;
			}
			else
			{
				tmp.next=p;
				tmp.prev=pr;
				pr.next=tmp;
				if(p!=null)
				{
					p.prev=tmp;
				}
			}
		}
		root=out;
	}

	@Override
	public void reverse()
	{
		Node2 out=null;
		Node2 tmp=root;
		while(root!=null)
		{
			tmp=root;
			root=root.next;

			tmp.next=out;
			if(out!=null)  out.prev=tmp;
			out=tmp;
		}
		root=out;
	}

	@Override
	public void halfReverse()
	{	
		//int d = (size()%2==0)?0:1;
		int count=0;
		Node2 tmp=root;
		while(tmp.next!=null) tmp=tmp.next;
		while(count<size()/2)
		{
			tmp.next=root;
			tmp=tmp.next;
			tmp.next=null;

			root=root.next;
			count++;
		}
	}

}

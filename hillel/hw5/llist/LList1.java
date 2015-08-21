package edu.hillel.hw5.llist;

public class LList1 implements EList
{
	public class Node 
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}


	Node root=null;
	@Override
	public int size()
	{
		int count=0;
		Node tmp=root;
		while (tmp!=null)
		{
			count++;
			tmp=tmp.next;
		}

		return count;
	}

	@Override
	public void init(int[] ini)
	{	
		clear();
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
		Node temp=root;
		int[] tmp = new int[size()];

		for (int i = 0; i < tmp.length; i++) 
		{
			tmp[i] = temp.data;
			temp=temp.next;
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{
		if(size() == 0||pos<0||pos>size()-1)
			throw new ListIsEmptyException();

		Node tmp=root;
		int count=0;
		while(count<pos)
		{
			tmp=tmp.next;
			count++;
		}
		return tmp.data;
	}

	@Override
	public void set(int pos, int val) 
	{
		if(size() == 0||pos<0||pos>size())
			throw new ListIsEmptyException();

		Node tmp=root;
		int count=0;
		while(count<pos)
		{
			tmp=tmp.next;
			count++;
		}
		tmp.data=val;
	}

	@Override
	public void addStart(int val)
	{
		Node tmp=new Node(val);
		tmp.next=root;
		root=tmp;
	}

	@Override
	public void addEnd(int val)
	{
		if(root==null) addStart(val);
		else
		{
			Node tmp=root;		
			while (tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.next=new Node(val);
		}
	}

	@Override
	public void addPos(int pos, int val)
	{
		if(pos<0||pos>size())
			throw new ListIsEmptyException();

		if(pos==0)
		{
			addStart(val);
		}
		else
		{
			int count=0;
			Node tmp=root;
			while(count<pos-1){
				tmp=tmp.next;
			}
			Node nodeNew=new Node(val);
			nodeNew.next=tmp.next;
			tmp.next=nodeNew;
		}
	}

	@Override
	public int delStart()
	{		
		if(size() == 0)
			throw new ListIsEmptyException();

		int ret = root.data;
		root=root.next;
		return ret;
	}

	@Override
	public int delEnd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();
		int ret;
		if(size()==1) 
		{
			ret=delStart();
		}
		else
		{
			Node tmp=root;
			int count=0;
			while(count<size()-2)
			{
				tmp=tmp.next;
				count++;
			}
			ret=tmp.next.data;
			tmp.next=null;
		}
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		if(size()==0||pos<0||pos>size())
			throw new ListIsEmptyException();
		int ret=0;

		if(pos==0) ret=delStart();
		else if(pos==size()-1) ret=delEnd();
		else
		{
			int count=0;
			Node tmp=root;
			while(count<pos-1){
				tmp=tmp.next;
				count++;
			}
			ret=tmp.next.data;
			tmp.next=tmp.next.next;
		}
		return ret;
	}

	@Override
	public int min()
	{
		if(size() == 0)
			throw new ListIsEmptyException();		

		Node tmp=root;
		int min = tmp.data;
		while(tmp!=null)
		{
			if(tmp.data<min) min=tmp.data;
			tmp=tmp.next;
		}
		return min;
	}

	@Override
	public int max()
	{
		if(size() == 0)
			throw new ListIsEmptyException();		

		Node tmp=root;
		int max = tmp.data;
		while(tmp!=null)
		{
			if(tmp.data>max) max=tmp.data;
			tmp=tmp.next;
		}
		return max;
	}

	@Override
	public int minInd()
	{
		if(size() == 0)
			throw new ListIsEmptyException();		

		Node tmp=root;
		int min=tmp.data;
		int minInd = 0;
		int index=0;
		while(tmp!=null)
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

		Node tmp=root;
		int max=tmp.data;
		int maxInd = 0;
		int index=0;
		while(tmp!=null)
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
		Node q,out=null,p,pr;
		while(root!=null){
			q=root;
			root=root.next;
			for(p=out,pr=null;p!=null&&q.data>p.data;p=p.next)
			{
				pr=p;
			}
			if(pr==null)
			{
				q.next=out;
				out=q;
			}
			else
			{
				q.next=p;
				pr.next=q;
			}
		}
		root=out;
	}

	@Override
	public void reverse()
	{
		Node out=null;
		Node q;
		while (root!=null)
		{
			q=root;
			root=root.next;
			q.next=out;
			out=q;
		}
		root=out;
	}

	@Override
	public void halfReverse()
	{		
		if(size()==0||size()==1) return;
		int d = (size()%2==0)?0:1;
		Node out;
		Node tmp=root;		
		for(int i=0;i<size()/2-1;i++)
		{
			tmp=tmp.next;
		}
		out=tmp.next;
		tmp.next=null;
		if(d==1)
		{
			tmp=out;
			out=out.next;
			tmp.next=root;
			root=tmp;
		}
		tmp=out;
		while(tmp.next!=null)
		{
			tmp=tmp.next;
		}
		tmp.next=root;
		root=out;
	}
}

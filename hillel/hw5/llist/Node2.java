package edu.hillel.hw5.llist;

public class Node2
{
	private int data;
	private Node2 next;
	private Node2 prev;
	
	public Node2 getPrev() {
		return prev;
	}
	public void setPrev(Node2 prev) {
		this.prev = prev;
	}
	
	public int getData() 
	{	
		int temp=data;
		return temp;
	}
	public void setData(int data) 
	{
		this.data = data;
	}
	public Node2 getNext() 
	{
		return next;
	}
	public void setNext(Node2 next) 
	{
		this.next = next;
	}
}

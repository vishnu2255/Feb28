package DataStructures;

import java.util.Stack;

class Qrev{
	
	public void reveQ(Queues q) throws Exception
	{
		q.show();
		
		Stack<Integer> st = new Stack<Integer>();
		
		while(!q.isEmpty())
		{
			st.push(q.dequeu());			
		}
		
		while(!st.isEmpty())
		{
			q.enque(st.pop());
		}
		
		q.show();
	}			
}


class Qwith2stacks<T>
{
	
private Stack<T> s1 = new Stack<T>();
private Stack<T> s2 = new Stack<T>();

public void enQ(T data)
{	
s1.push(data);	
}

public T deQ()
{
	if(s2.isEmpty())
	{
 	    while(!s1.isEmpty())
	    {
	    	s2.push(s1.pop());
	    }		
	}
	return s2.pop();		
}

}
public class Queues {

	private Node front,rear;
	private int size;
	
	Queues()
	{
		this.front=null;
		this.rear=null;
		this.size=0;
	}
	
	class Node
	{
//	Node front,rear;
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
		
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enque(int data)
	{
		Node tmp = new Node(data);
		if(isEmpty())
		{
			rear = tmp;
			front = tmp;
		}
		else
		{
			rear.next = tmp;
			rear=rear.next;
		}
		size++;
		
	}
	
	public int dequeu() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("error");
		}
		
		int resu = front.data;
		front=front.next;
		size--;
		
		if(isEmpty())
		{
			rear=null;
		}
		return resu;
	}
	
	public void show()
	{
		Node curr = front;
		
		while(curr!=null)
		{
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println();
	}
}

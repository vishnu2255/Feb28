package DataStructures;

public class CircularLL {

Node tail;
int len;

CircularLL()
{
	tail=null;
	len=0;
}
	
class Node
{
	Node next;
	int data;
	
	Node(int data)
	{
		this.data  =  data;
	}		
}

private void addNode(int data)
{
	Node temp = new Node(data);
	
	if(tail==null)
	{
		tail = temp;
		tail.next = tail;
		len++;
	}
	else
	{
//	Node current = tail.next;		
	temp.next = tail.next;
	tail.next = temp;
    len++;	
	}
}

public void fun100()
{
	for(int i=1;i<=100;i++)
	{
		addAtEnd(i);	
	}
	Node tmp=tail.next;	
	while(len!=1)
	{
	    tmp.next = tmp.next.next;
	    tmp=tmp.next;
	    len--;
	}
	System.out.println(tmp.data);
//Node p=new Node(1);
//
//Node q=p;
//int l=1;
//for(int i=2;i<=100;i++)
//{
//p=p.next;
//p.data = i;
//l++;
//}
//
//p.next= q;
//
//while(l!=1)
//{
//	q.next = q.next.next;
//	l--;
//	q=q.next;
//}
//System.out.println(q.data);

}

public void ele()
{
Node tmp = tail;



while(len!=1)
{
	tmp.next = tmp.next.next;
	tmp=tmp.next;
	len--;
}

System.out.println(tmp.data);
}
public void addAtBegin(int data)
{
	addNode(data);
}

public void addAtEnd(int data)
{
	addNode(data);
	tail=tail.next;
}

public int getLen()
{
return len;	
}

public int headpeek()
{
return tail.next.data;	
}

public int tailpeek()
{
return tail.data;	
}

public void printAll()
{
Node tmp = tail.next;

while(tmp!=tail)
{
	System.out.print(tmp.data+" --> ");
	tmp=tmp.next;
}
System.out.print(tmp.data);
System.out.println();

}

public int removeFromHead()
{
	if(tail==null)
	{
		return -1;
	}
	else if(tail==tail.next)
	{
		tail = null;
		len--;
		return tail.data;
		
	}
	else
	{
		Node tm = tail.next;
		int ret= tm.data;
		tail.next = tm.next;
		tm=null;
		len--;
		return ret;
		
	}
	
}

public int removeAndRet(int data)
{
	if(tail==null)
	{
		return Integer.MIN_VALUE;
	}
	
	if(tail.data == data)
	{
		Node tm = tail.next;
		int ret  = tail.data;
		while(tm!=tail)
		{			
			tm=tm.next;
		}
		tm.next = tail.next;
		tail = tm;
		return ret;
	}
	Node a = tail;
	Node b = tail.next;
	
	while(b!=tail)
	{
		if(b.data == data)
		{
			break;
		}
		a=b;
		b=b.next;
	}
	
	int ret = b.data;
	a.next = b.next;
	b=null;
	return ret;
}

public boolean contains(int data)
{
if(tail==null)
{
	return false;
}
	Node tmp = tail.next;
	while(tmp!=tail)
	{
		if(tmp.data==data)
		{
			return true;
		}	
		tmp = tmp.next;
	}
	return false;

}

public int removeFromTail() throws Exception
{
	if(tail == null)
	{
		throw new Exception();
	}
	else if(tail ==tail.next)
	{
		int ret=tail.data;
		tail = null;
		len--;
		return ret;
	}
	else
	{
		Node tmp = tail.next;
		int ret = tail.data;
		while(tmp.next!=tail)
		{
			tmp=tmp.next;
		}
		tmp.next = tail.next;
		tail=tmp;
		len--;
		return ret;
	}
	
}

}

package DataStructures;

public class Feb28 {

	static int reverseInt(int a)
	{
		System.out.println(Integer.MAX_VALUE);
		if(a>Integer.MAX_VALUE)
		{
			return 0;
		}
		boolean neg=false;
		if(a%10==0)
		{
			a=a/10;
		}
		else if(a<0)
		{
			neg=true;
			a=-a;			
		}
		
		int n=a;
		int rev=0;
		while(n>0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		
		if(neg)
		{
			System.out.println(-rev);
			return -rev;
		}
		else
		{
		System.out.println(rev);
		return rev;
		}
	}
	
	static void palindrome(int a)
	{
		int rev = 0;	
		int n=a;
		if(a>0 && (a%10 >0))
		{
			while(a>rev)
			{
				rev=rev*10 + a%10;
				a=a/10;							
			}
			
			if(n==rev || n==rev/10)
			{
				System.out.println("pal");
			}
			else
			{
				System.out.println("not");
			}
		}						
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		reverseInt(1534236469);
//		reverseInt(-123);
//		reverseInt(12);
//		
//		palindrome(313);
		
		LinkedList l1= new LinkedList();
		l1.add(3);
		l1.add(9);
		l1.add(13);
		l1.add(12);
		l1.add(10);
		l1.print(l1.head);
		l1.removenthNode(3);
		l1.print(l1.head);
//		l1.add(2);
		
		LinkedList l2= new LinkedList();
		l2.add(4);
		l2.add(6);
		l2.add(5);
		
		l1.print(l1.head);
		l2.print(l2.head);
		
//		l1.print(l1.add(l1.head, l2.head));
		l1.print(l1.addNodes(l1.head, l2.head));
		
		
		
	}
	
}

	class Node
	{
		Node next;
		int val;
		Node(int val)
		{
			this.val = val;
		}
	}
	
	class LinkedList{
		
		Node head;
		
		
		public void removenthNode(int n )
		{
			Node dumm= new Node(0);
			dumm.next = head;
			Node p=dumm;
			Node q=dumm;
			
			int i=1;
			
			while(i<=n)
			{
				p=p.next;
				i++;
			}
			
			while(p.next!=null)
			{
				p=p.next;
				q=q.next;
			}
			q.next=q.next.next;
			
		}
		
		public void print(Node head)
		{
			while(head!=null)
			{
				System.out.print("-> "+ head.val);
				head=head.next;
			}
			System.out.println();
		}
		public void add(int a)
		{
			Node n =new Node(a);
			
			if(head==null)
			{
				 head=n;
//				n.next = null;
			}
			else
			{
//				Node tmp = head;
//				while(tmp!=null)
//				{
//					tmp=tmp.next;
//				}
				n.next = head;
				head = n;
				
			}									
		}
		
		public Node addNodes(Node n1,Node n2)
		{
			Node dummy = new Node(0);
			Node curry = dummy;
			
			int carry=0;
			
			int sum=0;
			
			while(n1!=null || n2!= null)
			{
				int x = 0,y=0;
				if(n1!=null)
				{
					x=n1.val;
				}
                
				y = (n2!=null?n2.val:0);
				
				sum = carry+ x+y;
				dummy.next=new Node(sum%10);
				carry = sum/10;
				
				if(n1!=null)
				{
					n1=n1.next;
				}
				if(n2!=null)
				{
					n2=n2.next;
				}
				dummy=dummy.next;						
			}
			
			if(carry>0)
			{
				dummy.next = new Node(carry);
			}
			
			return curry.next;
		}
		
		public Node add(Node n1,Node n2)
		{
			Node res= new Node(0);
			Node tmp=res;
//			if(n1==null)
//			{
//				return n2;
//			}
//			
//			if(n2==null)
//			{
//				return n1;
//			}
			int car = 0;
			int sum = 0;
//			int x,y;
			while(n1!=null || n2!= null)
			{
				sum = (car + n1.val + n2.val);
				int v= sum%10;
				res.next = new Node(v);
				car = sum/10;
				n1=n1.next;
				n2=n2.next;
				res=res.next;
			}
						
			return tmp.next;		
		}		
	}

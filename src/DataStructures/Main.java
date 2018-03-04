package DataStructures;

import java.text.NumberFormat;

public class Main {

	

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		NumberFormat num= NumberFormat.getCurrencyInstance();
		
		
		System.out.println(num.format(12.23));
		
		
		Queues qq = new Queues();
		
		qq.enque(12);
		qq.enque(13);
		qq.enque(14);
		qq.enque(15);
		
//		qq.show();
		
		Qrev q= new Qrev();
		q.reveQ(qq);
		
		CircularLL obj = new CircularLL();
//		obj.addAtBegin(6);
//		obj.addAtBegin(5);
//		obj.printAll();
//		obj.addAtBegin(4);
//		obj.addAtBegin(3);
//		obj.addAtBegin(2);
//		obj.addAtBegin(1);
//		obj.printAll();
		obj.fun100();
		obj.ele();
		
		obj.printAll();
		
//		obj.removeFromHead();
//		obj.printAll();
		
//		obj.removeFromTail();
//		obj.printAll();
		
		if(obj.contains(12))
		{
			System.out.println(obj.removeAndRet(12));
		}		
		obj.printAll();				
	}

}

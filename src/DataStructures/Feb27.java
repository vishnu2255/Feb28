package DataStructures;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Feb27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simple approach
		
		int[] arr= {0,-1,2,-3,1};
		int len = arr.length;
		for(int i=0;i<len-2;i++)
		{
			for(int j=i+1;j<len-1;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.format(" [ %d %d %d ] ",arr[i],arr[j],arr[k]);
						System.out.println();
					}
				}
			}			
		}
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<len;i++)
		{
			hm.put(arr[i], i);
		}
			
		for(Entry<Integer, Integer> s : hm.entrySet())
		{
		System.out.println(s.getKey()+"-->>"+s.getValue());
		}
			

		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{				
				int x = -(arr[i]+arr[j]);
				int val ;
				if(hm.containsKey(x))
				{		
					for(Entry<Integer, Integer> s : hm.entrySet())
					{
					
						if(s.getKey() == x)
						{
							val= s.getValue();
							if(val!=i && val!=j)
							{
							System.out.format("[ %d %d %d ]",arr[i],arr[j],x);	
							System.out.println();
							}
						}
						
						
						}						
				
//					if(hm.get(x)!= i && hm.get(arr[i])!=j)
//					{
//						System.out.format(" %d %d %d",arr[i],arr[j],x);	
//					}									
				}				
			}
		}
		
				
	}

}

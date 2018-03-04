package DataStructures;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Mar1 {

	
	static void dupl()
	{
		//effiient method
		
		int[] arr= {1,2,2,3,3,4};
		
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		System.out.println(i+1);
	}
	static int duplarr(int[] nums)
	{
		HashMap<Integer,Integer> map =new HashMap<>();
		
//		for(int i=0;i<nums.length;i++)
//		{
//			map.put(i, nums[i]);
//		}
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
		
			if(map.containsValue(nums[i]))			
		{
			
		}
		else
		{
			map.put(j, nums[i]);
			nums[j]=nums[i];
			j++;
		}
			
		}
		
//		for(Integer m : map.keySet())
//		{
//			nums[]
//		}
		return j;
		
		
		
	}
	
	static int arr(int[] nums,int val)
	{
		int i=0;
		
		for(int j=0;j<nums.length;j++)
		{
			if(nums[j]!=val)
			{
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dupl();
		int[] a= {1,1,2};

		
		
		
		
		
		System.out.println(duplarr(a));
		
		
		int [] ar= {3,2,2,3};
		int val = 3;
		
		System.out.println(arr(ar,val));
		HashMap<Integer,Integer> map =new HashMap<>();
		
		for(int i=0;i<ar.length;i++)
		{
			map.put(ar[i], i);
		}
		
		int ind=0;
		
		for(Entry<Integer, Integer> m : map.entrySet())
		{
			if(m.getKey()!=val)
			{
				ar[ind]=m.getKey();
				ind++;
			}
		}
		
		System.out.println(ind);
	}

}

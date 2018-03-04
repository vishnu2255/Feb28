package reflections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,5};
		int eleToSearch =4;
		boolean found = false;
		for(int i : arr)
		{
			if(i==eleToSearch)
			{
				found = true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}

}

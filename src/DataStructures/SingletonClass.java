package DataStructures;

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Single a =Single.getInstance();
		
		Single b =Single.getInstance();
		Single c =Single.getInstance();
		
		System.out.println(a.s);
		System.out.println(b.s);
		System.out.println(c.s);
	}

}

class Single
{

	String s=null;
	private static Single instance = null;
	
	private Single()
	{
		s="instance method";
	}
	
	  static Single getInstance()
	{
		if(instance==null)
		{
			instance= new Single();
			return instance;
		}
		
		return instance;
	}
	
}

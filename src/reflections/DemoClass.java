package reflections;

import java.lang.reflect.Constructor;

public class DemoClass {

	
	public DemoClass()
	{
		System.out.println("without params");
	}
	public DemoClass(String a)
	{
		System.out.println("one param");
	}
	public DemoClass(String a,String b)
	{
		System.out.println("two params");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
//		DemoClass obj = new  DemoClass();
//		System.out.println(obj.getClass());
		
		Class className = Class.forName("reflections.DemoClass");
		System.out.println(className.getName());
		
		Constructor[] arr= className.getConstructors();
		
		for(Constructor c : arr)
		{
			System.out.println(c.getName());
		}
		
		Constructor c2 = className.getConstructor(new Class[] {int .class});
		
	}
catch(Exception e)
{
	
}
}

}

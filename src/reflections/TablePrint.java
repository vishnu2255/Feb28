package reflections;

import java.text.NumberFormat;
import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Calculator!!");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter monthly investment ");
		double amnt = sc.nextDouble();
		System.out.print("Enter interest rate ");
		double rate= sc.nextDouble();
		System.out.print("Enter no of years ");
		double years= sc.nextDouble();
		
		double futreval = 0;
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y"))
		{
			double mnthrate = rate/12/100;
			double months=years*12;
			for(double y=1;y<=months;y++)
			{
				futreval=(futreval+amnt)*(1+mnthrate);				
			}
			
			NumberFormat num = NumberFormat.getCurrencyInstance();
			
			System.out.println("future value is "+ num.format(futreval));
			
			System.out.println("continue (y/n)??");
			choice = sc.next();
			
		}
		
		System.out.println("bye ! !");
		sc.close();
		
		
	}

}

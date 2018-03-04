package reflections;

import java.util.Scanner;

public class GuessApp {

	static int generateRandom()
	{
		int r = (int) (Math.random()*100);		
		return ++r;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int rand = generateRandom();
		int cnt=0;
		while(true)
		{
			System.out.println("Enter a num between 1 and 10 to guess!!");
			int input = sc.nextInt();
			
			cnt++;
			if(input<1 || input>10)
			{
				System.out.println("Number not in range");
				continue;
			}
			
			if(input<rand)
			{
			System.out.println("Num too low");	
			}
			else if(input>rand)
			{
				System.out.println("Num too high");
			}
			else if(input==rand)
			{
				System.out.format("You guessed in %d tries \n",cnt);
				break;
			}
		}
		sc.close();
		System.out.println("bye !!");
	}
	
	

}

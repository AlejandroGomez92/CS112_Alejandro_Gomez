import java.util.Scanner;


public class Week5Lab5 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int userNum;
		int computerNum = 0 + (int) ( Math.random() * 10 );
		int count = 1;
		
		while (count < 4) 
		{  
		
		System.out.print("Guess a number between 1 and 10: ");
		userNum = input.nextInt();
		
		if (userNum < computerNum )
			{
		
			System.out.println("You guessed too low!");
			}
		
		else if (userNum > computerNum )
			{
			System.out.println("You guessed too high.");
			}
		
		else
			{
			System.out.println("You guessed correct.");
			}
		
		count++; 
		}
		
		System.out.println("Good Bye.");
	}
}

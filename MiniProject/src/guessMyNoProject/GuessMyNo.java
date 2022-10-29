package guessMyNoProject;

import java.util.Scanner;

public class GuessMyNo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=(int)(Math.random()*100);
	int b=0;
	
	do
	{
		System.out.println("Guess My Numbern from 1 to 100");
		b=sc.nextInt();

		if (b==a)
		{
			System.out.println("Hureyyyyy........You Guesed Correct Number");
			break;

		}
		
		else if (a < b)
		{
			System.out.println("Your Number is too Large");
		}
		else 
			System.out.println("Your Number is too Small");
	}
	while (b >= 0);
}

}

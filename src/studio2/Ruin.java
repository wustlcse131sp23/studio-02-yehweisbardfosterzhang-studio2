package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Starting amount: ");
		int startAmount = in.nextInt();
		System.out.println("Win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		System.out.println("How many days of gambling?");
		int days = in.nextInt();
	
		
		int winCount = 0;
		int money = startAmount;
		
	for(int totalSimulations = days; totalSimulations > 0; totalSimulations--)
	{
		while (money < winLimit && money > 0)
		{
			double randNum = Math.random();
			boolean win = randNum <= winChance;
			System.out.print("Win: " + win);
			
			if (win == true)
			{
				winCount++;
				money++;
				System.out.println("Wins: " + winCount);
				System.out.println("Money: " + money + "$");
			}
			else
			{
				winCount--;
				money--;
				System.out.println("Wins: " + winCount);
				System.out.println("Money: " + money + "$");
			}
		}
	}
		
	if (money == winLimit)
			{
		
			System.out.println("It was a successful day!");
			}
	else
	{
		System.out.println("You're in ruin :(");
	}

	}
}



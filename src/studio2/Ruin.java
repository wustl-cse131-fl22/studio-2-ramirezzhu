package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("start amount:");
		double startAmount = in.nextDouble();
		System.out.println("Win chance:");
		double winChance = in.nextDouble();
		System.out.println("Win Limit:");
		double winLimit = in.nextDouble();
		
		while (startAmount < winLimit &&  startAmount > 0 )
		{ 
			Boolean winLose = Math.random() < winChance ;
			
			if (winLose == true)
					{ startAmount++ ; }
					
					else 
						{ startAmount-- ;}
			System.out.println(startAmount);
			
		}
	}

}

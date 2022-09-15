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
		System.out.println("Simulations:");
		int totalSimulations = in.nextInt();
		int Simulation = 0;
		int games = 0;
		(while simulationNumber < totalSimulations
			{	(while (startAmount < winLimit &&  startAmount > 0 )
				{
				Boolean winLose = Math.random() < winChance ;
			
				if (winLose)
				{ startAmount++ ; }
					
				else 
					{ startAmount-- ;}
				games = games + 1;
				System.out.println(startAmount);
				}
				Simulation = Simulation +1;
				System.out.println("Simulation Day: " + Simulation + XYZ + ZYX)
			}

}

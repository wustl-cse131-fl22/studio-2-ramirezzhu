package studio2;

import java.util.Scanner;

public class Ruin_solo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); // load scanner
		//variables
		System.out.println("start amount:");
		int intialAmt = in.nextInt();
		int startAmount = intialAmt;
		System.out.println("Win chance:");
		double winChance = in.nextDouble();

		System.out.println("Win Limit:");
		double winLimit = in.nextDouble();

		//simulation variables
		System.out.println("Total simulations:");
		int simulationTotal = in.nextInt();
		int simulation = 0;
		int count =0 ;
		String winLose = " " ;
		//big loop
		int ruin = 0 ;
		for (simulation = 0; simulation < simulationTotal; simulation ++)
		{
			count = 0; // reset the count for each day
			startAmount = intialAmt; // set the startAmount back to the scanned value
			//runs the chance game
			while (startAmount < winLimit &&  startAmount > 0 )
			{ 
				Boolean win = Math.random() < winChance ;

				if (win)
				{ startAmount++ ; }

				else 
				{ startAmount-- ;}

				count ++ ;
			}
			// end of the game day

			if (startAmount == winLimit)
			{
				winLose = "WIN" ;
			}
			else
			{
				winLose = "LOSE" ;
				ruin++; // counts the loses that occur 
			}
			System.out.println("Simulation " + (simulation+1) + ":\t" + count + "\t" + winLose); //prints the events of the day 

		}
		// after all simulation have run

		// make a rounded ruin percent
		double ruinPercent = (double) ruin / simulationTotal; 
		ruinPercent = Math.round(ruinPercent * 100.0) / 100.0;

		//scary formula
		double a = (double) (1 - winChance) / winChance ;
		double expectedRuin = 0;
		if (winChance == 0.5)
		{
			expectedRuin = (double) ( 1 - (  intialAmt / winLimit));
		}
		else 
		{
			expectedRuin = (double) ((Math.pow(a, intialAmt))- (Math.pow(a, winLimit))) / (1 - Math.pow(a, winLimit)) ; 
		}
		//end print
		System.out.println("Losses: \t" + ruin + "\t Simulations:" + simulationTotal);
	System.out.println("Ruin rate: " + ruinPercent + "\n Expected ruin rate: " + expectedRuin );
	}
}

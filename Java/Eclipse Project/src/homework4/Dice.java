/**
 * 
 */
package homework4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author William Bollock, CGS 3416, web15c
 *
 */
public class Dice {

	public static int rollDice() {
		int total=0;
		// returns total of two dice as int
		// use BOTH random number ways
		// roll 2 dice and add together
		int diceRoll1 = 0;
		int diceRoll2 = 0;
		
		// Method 1 -> Random Object
		Random rand = new Random(); // random object
		for(int i =1; i < 6; i++)
		{
		diceRoll1 = rand.nextInt(6) + 1; // +1 to avoid 0
		}
		
		//Method 2 with Math.random()
		for(int i=1; i < 6; i++)
		{
			diceRoll2 = (int) (Math.random() * 6 + 1); 
		}
				
		total = diceRoll1 + diceRoll2;
		return total;
	} // end of Roll Dice
	
	
	
	public static void main(String[] args) {
		
		System.out.print("How many times would you like to roll the two dice? ");
		Scanner sc = new Scanner(System.in);
		double timesRolled = sc.nextDouble();
		// for loop w/ dice total, maybe
		
		double twoSum=0;
		double sevenSum=0;
			
		int i = 0;
		while( i < timesRolled) {
		
			double diceTotal = rollDice();
			if ( diceTotal == 2 ) {
				twoSum = twoSum + 1;
			}
			else if( diceTotal == 7) {
				sevenSum = sevenSum + 1;
			}
			i++;
		}
		
		System.out.println("");
		
		double twoSumRate = (twoSum / timesRolled) * 100.00; // * 100 to get right percentage
		System.out.println("Snake eyes (double 1s) appeared");
		System.out.printf("\t%.0f times", twoSum); // exactly as sample output
		System.out.println("");
		System.out.printf("\t%.2f %% of the time", twoSumRate );

		System.out.println("");
		System.out.println("");
		
		double sevenSumRate = (sevenSum / timesRolled) * 100.00; // * 100 to get right percentage
		System.out.println("A roll of 7 appeared");
		System.out.printf("\t%.0f times", sevenSum);
		System.out.println("");
		System.out.printf("\t%.2f %% of the time", sevenSumRate );
	}

}

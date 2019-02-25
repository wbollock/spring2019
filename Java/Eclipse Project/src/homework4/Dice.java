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
		diceRoll1 = rand.nextInt(5) + 1; // +1 to avoid 0, 5 to avoid a 7 dice roll
		}
		
		//Method 2 with Math.random()
		for(int i=1; i < 6; i++)
		{
			diceRoll2 = (int) (Math.random() * 6) + 1; 
		}
				
		total = diceRoll1 + diceRoll2;
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceTotal = rollDice();
		System.out.println("dice total is: " + diceTotal);
		
		System.out.print("How many times would you like to roll the two dice?");
		Scanner sc = new Scanner(System.in);
		int timesRolled = sc.nextInt();
		// for loop w/ dice total, maybe
		
		for(int i =0; i<timesRolled; i++);
		{
			// count how many times 2 and 7 appear
			// if 2 appears, add to snake eyes counter
			// divide counter by times rolled
			
		}
		System.out.println("Snake eyes double 1s appeared");
	}

}

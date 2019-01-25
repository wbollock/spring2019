/**
 * 
 */
package week3;
import java.util.*;
/**
 * @author William Bollock (web15c)
 *
 */
public class Shipping {

	public static void main(String[] args) {
		//declare vars
		double weight;
		int shipDistance; // could require decimal integers
		String amazonPrime = ""; // empty string
		double shipRate=0; // per 50 miles
		String dummyString = ""; // used to capture \n so nextLine can take it
		
		System.out.println("Welcome to the Amazon Shipping Calculator");
		System.out.println(""); // empty for formatting
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the weight of the package, in Kg: ");
		weight = sc.nextDouble();
		
		
		
		if(weight < 0)
		{
			System.out.println("Cannot accept packages with negative weight. Program aborted.");
			System.exit(0); // if weight is less than 0, exit
		}
		else if (weight < 2 && weight > 6)
		{
			shipRate = 5.10;
		}
		else if(weight > 2 && weight < 6) // need logical && for both
		{
			shipRate = 10.18; // following shipping chart
		}
		else if(weight > 6 && weight < 10)
		{
			shipRate = 22.43; // following shipping chart
		}
		else if(weight > 10 && weight < 20)
		{
			shipRate = 40.60; // following shipping chart
		}
		else
		{
			System.out.println("Cannot accept packages more than 20kg. Program aborted.");
			System.exit(0); // if weight is more than 20, exit
		}

		System.out.print("Please enter the distance to be shipped (in miles): ");
		shipDistance = sc.nextInt();
		
		if(shipDistance <= 0)
		{
			System.out.println("Shipping distance must be positive. Program aborted.");
			System.exit(0); // distance less than or equal to 0, exit
		}
		else if(shipDistance > 3000)
		{
			System.out.println("Shipping distance must less than 3000 miles. Program aborted.");
			System.exit(0); // distance less than or equal to 0, exit
		}
		
		
		System.out.println(""); // empty for formatting
		System.out.print("Are you an Amazon Prime member (Yes/No): ");
		dummyString= sc.nextLine(); // nextLine will take the next new line unless a dummy string is used
		amazonPrime= sc.nextLine();
		System.out.println(""); // empty for formatting
		//print out values for user. need weight, rate, miles, and total cost
		System.out.println("Package weight = " + weight + " Kg");
		System.out.printf("Shipping rate = $%.2f per 50 miles", shipRate);
		System.out.println(""); // empty for formatting
		System.out.println("Number of miles = " + shipDistance);
		System.out.println(""); // empty for formatting
		//calcuation
		if(amazonPrime == "Yes")
		{
			double cost = (shipRate * Math.ceil((shipDistance/50))) * .9; // do .9 to give amazon prime members 10& discount
			System.out.printf("Total shipping charges = $%.2f", cost);
		}	 
		else 
		{			
			
			double cost = shipRate * Math.ceil((shipDistance/50.0)); // Distance per 50 miles
			System.out.printf("Total shipping charges = $%.2f", cost);
			
		}
		//System.out.println("no ceil" + shipDistance/50.0);
		//System.out.println("ceil" + (int)Math.ceil(shipDistance/50.0));
		// note difference in above two statements. Need 50.0 (decimal place) for proper rounding.
		System.out.println(""); // empty for formatting
		System.out.println(""); // empty for formatting
		System.out.println("Goodbye");
		
		
	}

}

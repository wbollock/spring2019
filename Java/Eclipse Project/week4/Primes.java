import java.util.Scanner;

public class Primes {
/*
 * Author: Will Bollock, web15c
 */
	public static void main(String[] args) {
		
		int upbound;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		upbound = sc.nextInt();
		
		//iterate through uppbound, print prime numbers
		System.out.println("The prime numbers are: ");
		System.out.print("2"); // for formatting, 2 will always be prime
		for(int i = 3; i <= upbound ; i++) // counter var #1. also first prime number has to be 3 at least
		{
			int extravar=0; // flag var
			
			for(int n = 2; n <= i/2; n++) // n has to be at least least than i/2, because it won't divide evenly
			{
				if(i % n == 0) // if it's not prime, then add to extravar
				{
				extravar++; // flag
				}	 // end of if
				
			} // end of inner for
		if(extravar == 0) // if i added to extravar, this can't be true, so it wouldn't print
					System.out.print( ", " + i); // should be noted for myself this is outside the inner loop
		} // end of outer for
		
	}
	
}
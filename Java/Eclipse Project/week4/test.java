import java.util.Scanner;

public class test {
/*
 * Author: Will Bollock, web15c
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upbound;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		upbound = sc.nextInt();
		
		//iterate through upperLimit, print prime numbers
		System.out.println("The prime numbers are: ");
		for(int i = 2; i <= upbound ; i++) // counter var #1. also first prime number has to be 2 at least
		{
			int extravar=0; // a third counter var
			for(int n = 2; n <= i/2; n++) // n has to be at least least than i/2, because it won't divide evenly if its more than that
			{
				
				if(i % n == 0) // checking to see if it's NOT prime
				{
				extravar++;
					// if it's not prime, then add to extravar
				}
				
				
			}
		
		if(extravar ==0) // if i added to extravar, this can't be true, so it wouldn't print
					System.out.print(i + ","); // should be noted for myself this is outside the inner loop
				
		
		
		}
		System.out.println(""); // moved outside the loops
	}
	
}
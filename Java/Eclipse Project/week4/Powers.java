import java.util.Scanner;

public class Powers {
/*
 * Author: Will Bollock, web15c
 */
	public static void main(String[] args) {

		// print all powers of 2 for an upper range and calculate their sum
		
		int upperLimit;
		long sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		upperLimit = sc.nextInt();
		
		
		// print all powers of 2 for an upper range and calculate their sum
		
		
		int power=2;
		System.out.print("1"); // 1 will always be a factor, print 1 here so "+" sign is only on previous values
		while(power <= upperLimit)
		{
			
				System.out.print(" + " + power); // + sign first so it won't hang at the end
				power = power * 2; // power of 2
				sum = sum + power; // calculate sum
				
					/*if((sum/2) == (2 * power - 1)) // for debug purposes
					{
					//System.out.print(+);
					System.out.print("test");
					//break; // leave while loop
					}*/ 
					//System.out.print("(SUM = " + sum + ")" + power);
				
				
		} // end of while loop
		
		System.out.print(" = " + (sum/2 + 1)); // divide by two to get correct value, add 1
		
	}
	

}

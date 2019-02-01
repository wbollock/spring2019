import java.util.Scanner;

public class Powers {
/*
 * Author: Will Bollock, web15c
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print all powers of 2 for an upper range and calculate their sum
		
		int upperLimit;
		long sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		upperLimit = sc.nextInt();
		
		
		// print all powers of 2 for an upper range and calculate their sum
		
		
		
		int power=2;
		System.out.print("1"); // 1 will always be a factor
		while(power <= upperLimit)
		{
			
			
				System.out.print(" + " + power);
				power = power * 2; // power of 2
				sum = sum + power;
				
					/*if((sum/2) == (2 * power - 1)) // the last value
					{
					//System.out.print(+);
					System.out.print("test");
					//break; // leave while loop
					}*/
					
				
				// for last value, need to get rid of the plus sign
				//debug
				//System.out.print("(SUM = " + sum + ")" + power);
				
				
		} // end of while loop
			System.out.print(" = " + (sum/2)); // divide by two to get correct value
			// one solution is to add /b/b to this print statement.. not good
	}
	

}

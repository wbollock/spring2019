import java.util.*;
public class LargestThreeNumbers {

	public static void main(String[] args) {
	    /* Program swaps 2 ints
			Checks for integers/non numbers
		*/
		
		
		int num1=0;
		int num2=0;
		int num3=0;
    System.out.print("Please input an integer: ");
		boolean valid = false;
		while(!valid){
			try{
					// Scanner must "refresh" in try block
				Scanner sc = new Scanner(System.in);
				num1 = sc.nextInt();
				valid = true;
			}
			catch(InputMismatchException exception)
			{
				System.out.println("Please enter a valid integer");

			} // need to make that loop
		}

		valid = false;
		while(!valid){
			try{
				System.out.print("Please input the second integer: ");
			Scanner sc2 = new Scanner(System.in);
				num2 = sc2.nextInt();
				valid = true;
			}
			catch(InputMismatchException exception)
			{
				System.out.println("Please enter a valid second integer");
			} // need to make that loop
		}
	
		valid = false;
		while(!valid){
			try{
				System.out.print("Please input the third integer: ");
			Scanner sc2 = new Scanner(System.in);
				num3 = sc2.nextInt();
				valid = true;
			}
			catch(InputMismatchException exception)
			{
				System.out.println("Please enter a valid third integer");
			} // need to make that loop
		}
	
		if ( num1 > num2 && num1 > num3 )
		System.out.println("The first number is the largest.");
		else if (num2 > num1 && num2 > num3)
		System.out.println("The second number is the largest.");
		else if (num3 > num1 && num3 > num2)
		System.out.println("The third number is the largest.");
		else
		System.out.println("A bad programmer did not account for this edge case.");

		

	

				}

}	

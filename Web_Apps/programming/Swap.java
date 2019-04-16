import java.util.*;
public class Swap {

	public static void main(String[] args) {
	    /* Program swaps 2 ints
			Checks for integers/non numbers
		*/
		
		
		int num1=0;
		int num2=0;
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
		System.out.println("Before swap:");
		System.out.println("num1: " +  num1);
		System.out.println("num2: " + num2);
		// now swap numbers
		System.out.println("");
		System.out.println("After swap:");
		int num3;
		int num4;
		// use holders
		num3 = num1;
		num4 = num2;
		num1 = num4;
		num2 = num3;
		

		System.out.println("num1: " +  num1);
		System.out.println("num2: " + num2);
		

	

				}

}	

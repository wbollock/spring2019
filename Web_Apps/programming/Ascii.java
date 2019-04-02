import java.util.*;
public class Ascii {

	public static void main(String[] args) {
	    /* Program needs to:
		Print characters A-Z as ASCII values 
		then
		Print ASCII values 48-122 as characters
		then
		Allow user to enter ASCII value(32-127)
		(check if it's not 32-127)
		if it is, print according ASCCI value
		example, 65 = A*/

		int ascii_value;

		

		//Print A-Z & Print ASCII values
		System.out.println("Printing A-Z and corresponding ASCII Values");
		for(ascii_value = 65; ascii_value <= 90; ++ascii_value)
			System.out.println("ASCII:" + (char)ascii_value + " " + "VALUE:" + ascii_value);

		System.out.println("------------------------");

		System.out.println("Printing ASCII values 48-122 as characters");
		for(ascii_value = 48; ascii_value <= 122; ++ascii_value)
			System.out.println("ASCII VALUE:" + ascii_value + "     HAS VALUE:" + (char)ascii_value);

		System.out.println("------------------------");
		System.out.println("Asking for user input now:");
		Scanner sc = new Scanner (System.in);

		System.out.print("Please enter ASCII value(32-127): ");
		ascii_value = sc.nextInt();
		while (ascii_value < 32 || ascii_value > 127)
		{
			System.out.println("Please enter a value between 32-127..");
			ascii_value = sc.nextInt();
		}
		System.out.println("ASCII value " + (char)ascii_value + " has value " + ascii_value);

		

	}

}

package week5;

import java.util.Scanner;

public class ReadStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read 10 strings in from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 10 strings: ");
		
		String string1 = new String();
		System.out.print("String 1: ");
		string1 = sc.nextLine();
		
		
		
		System.out.print("String 2: ");
		String string2 = new String();
		string2 = sc.nextLine();
		
		System.out.print("String 3: ");
		String string3 = new String();
		string3 = sc.nextLine();
		
		System.out.print("String 4: ");
		String string4 = new String();
		string4 = sc.nextLine();
		
		System.out.print("String 5: ");
		String string5 = new String();
		string5 = sc.nextLine();
		
		String masterString = new String();
		masterString = string1.concat(string2).concat(string3).concat(string4).concat(string5);
		
		
		System.out.println(masterString.replace('e', 'i'));

	}

}

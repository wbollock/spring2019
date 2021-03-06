package homework4;

import java.util.Scanner;

public class Primes {

	public static boolean isPrime (int primeNum) {
		// method will return true if primeNum is prime, false if not
		
		for(int i = 2; i <= primeNum/2; ++i) // see wjat numbers it is divisible by
        {
            if(primeNum % i == 0)
            {
                return false; // not prime
            }
        }
		
		return true; // passes check, is prime

	} // end of isPrime
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please input a positive number: ");
		Scanner sc = new Scanner (System.in);
		int userInt = sc.nextInt();
		
		// find and print all prime numbers less than or equal to user input
		// restrict output to 9 numbers per line
		System.out.println("The prime numbers less than or equal to " + userInt + " are:");
		int counter=0;
		for(int i = 2; i <= userInt ; i++) {
			if(isPrime(i) == true)
			{
				System.out.print(i + " ");
				counter++; // if counter gets to 9, print new line
				if(counter == 9)
				{
					System.out.println("");
					counter = 0; // reset counter
				}
			}
		}

	}

}

package week5;

import java.util.Scanner;

public class RectanglePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the length of the rectangle: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println("");
		System.out.print("Enter the width of the rectangle: ");
		int width = sc.nextInt();
		System.out.println("");
		
		for(int i=0;i < width; i++)
		{
			for(int j=0;j<length; j++)
			{
				System.out.print("*");
			}
				
			System.out.println("");
		}
	
		
		
	}

}
 
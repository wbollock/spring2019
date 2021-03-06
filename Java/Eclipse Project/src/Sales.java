/**
 * 
 */

/**
 * @author made by William Bollock (web15c)
 * 
 *
 */
import java.util.*;
public class Sales {
	
	public static void main(String[] args) {
		// all variables doubles to account for decimal place values
		double tvPrice;
		double washDryPrice;
		double refrigPrice;
		double microwavePrice;
		double salesTaxRate;
		double subTotal;
		double salesTaxTotal;
		double grandTotal;
		// new scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Sales!!");
		// using nextDouble due to variable types, taking user input
		System.out.print("What was the price of the TV? ");
		tvPrice = sc.nextDouble();
		
		System.out.print("and what was the price of the washer/dryer? ");
		washDryPrice = sc.nextDouble();
		
		System.out.print("and what was the price of the refrigerator? ");
		refrigPrice = sc.nextDouble();
		
		System.out.print("and what was the price of the microwave? ");
		microwavePrice = sc.nextDouble();
		
		System.out.print("What is the local sales tax rate? ");
		salesTaxRate = sc.nextDouble();
		
		System.out.println("Prices:");
		System.out.println("TV	= $" + tvPrice);
		System.out.println("Washer/Dryer		= $" + washDryPrice);
		System.out.println("Refrigerator		= $" + refrigPrice);
		System.out.println("Microwave		= $" + microwavePrice);
		
		// calculations being done, subtotal = all items put together
		subTotal = tvPrice + washDryPrice + refrigPrice + microwavePrice;
		
		// need to divide by 100 to get rate of sales tax
		salesTaxTotal = subTotal * (salesTaxRate / 100);
		// grandtotal is combination of salesTaxTotal amount and subTotal
		grandTotal = salesTaxTotal + subTotal;
		// using printf's when formatting numbers. does not affect calculations.
		System.out.printf("Your subtotal is $%.2f",subTotal);
		System.out.println(""); //empty line for formatting
		System.out.printf("And at a tax rate of %.1f percent ,this will add $%.2f in sales tax", salesTaxRate, salesTaxTotal);
		System.out.printf("for a grand total of $%.2f", grandTotal); // .2f will format to hundrendths place
		
		System.out.println(""); //empty line for formatting
		System.out.println("Goodbye!!");
		
		
		
	}

}

/*BANK ACCOUNT program, CGS3416
 * Will Bollock
 * web15c
 */

public class BankAccount
{
  /*INSTANCE VARIABLES - These are accessible to all members of the class*/
  /*=======================================================================*/
  private double balance;	// variable to stores the balance of the account
  private String name;		// String reference variable to store account name
  

  /*MEMBER FUNCTIONS*/
  /*=======================================================================*/
  /*CONSTRUCTOR that takes in one parameter for the account name
	Account Balance should be set to 0.00 by default here*/
  public BankAccount(String n)		
  {
     /*YOUR CODE HERE*/
	  //should intialize both name and balance
	  name = n; // account name equal to paramter
	  balance = 0.0;
	 
	 
  }

  /*CONSTRUCTOR that takes in two parameters for the account name
	and Account Balance. Check if balance is negative, if so set
	to default of 0.0. If not, set the account's balance as normal*/
  public BankAccount(String n, double b)   
  {
    /*YOUR CODE HERE*/
	name = n;
	if (b < 0) // if balance is negative, reset to 0.00
		balance = 0.00;
	else
		balance = b;
	
	
  }

  /* ACCESSOR method to retreive the balance for the account*/
  public double getBalance()		
  {
     /*YOUR CODE HERE*/
	  return balance;
  }

  /*Method that should calculate and set new balance of account. It should be 
    based on current balance amount plus deposit amount. If deposit value is negative
	do nothing and print msg. Else, It should update the balance variable.*/
  public void deposit(double d)		
  {
	 /*YOUR CODE HERE*/
	 if(d > 0)
		 balance = d + balance; // deposit adds to balance
	 else
		 System.out.println("Cannot deposit a negative amount..."); 
	 // do not add to balance if negative
	 
  }
  
  /*Method that should calculate what new balance of account should be 
    based on current amount minus withdrawl amount. Method should do some
	error checking to ensure account balance does not become negative, and
	to ensure withdrawal amount is valid as well (not negative). In either of these 
	cases, DO NOT change the account balance, but print out an error message.
	IF okay, then update the balance variable.*/
  public void withdraw(double w)	
  {
        /*YOUR CODE HERE*/
	 if( w < 0)
		 System.out.println("Cannot withdraw a negative amount");
	 else if ( w > balance )
	 {
		 System.out.printf("Your account balance is only $%.2f -- you cannot withdraw $ %.2f" ,balance,w);
		 System.out.println("");
	 }
	 else {
		 balance = balance - w;
	 	 System.out.printf("Withdrawing... $%.2f", w);
	 	 System.out.println("");
	 }
	
 }
  
  /*Method that prints out the account details/balance to the screen
    Balance should ALWAYS print out to 2 decimal places.*/
  public void printBal()
  {
	/*YOUR CODE HERE*/
		
		System.out.printf("%s Current Balance : $ %.2f", name, balance);
		System.out.println(""); // formatting
  }
  
  /*MAIN PROGRAM THAT WILL TEST THE METHODS OF THE CLASS YOU'VE WRITTEN ABOVE. 
  >>>>>>> DO NOT CHANGE THIS MAIN METHOD AT ALL <<<<<<<<   */
  public static void main(String args [])
  {
		
	/* Creating bank account using default constructor */
	BankAccount alpha = new BankAccount("Bill Gates");
	System.out.println("\nTesting default constructor... " );
	alpha.printBal();
	
	/* Tests deposit() */
	System.out.println("\nTesting deposit method... depositing $455.14" );
	alpha.deposit(455.14);
	alpha.printBal();
	System.out.println("\nTesting deposit method... depositing -$5.00" );
	alpha.deposit(-5.00);
	alpha.printBal();
	
	/* Tests getBalance() + withdraw() */
	System.out.println("\nRetreiving balance...");
	double bal = alpha.getBalance();
	System.out.println("Withdrawing half of that amount...");
	alpha.withdraw(bal/2);
	alpha.printBal();
	
	/*Testing constructor with 2 parameters*/
	BankAccount gamma = new BankAccount("Poor Paul", -333.33);
	System.out.println("\nAttempting to create account with negative value, should default to $0.00...");
	gamma.printBal();
	
	BankAccount beta = new BankAccount("Jameis Winston",283.33);
	System.out.println("\nCreating account with initial valid value $283.33...");
	beta.printBal();
		
	/* Testing withdraw more*/
	System.out.println("\nAttempting to withdraw negative value...");
	beta.withdraw(-4.11);
	beta.printBal();
	System.out.println("\nAttempting to withdraw more than balance...");
	beta.withdraw(3983.93);
	beta.printBal();
	System.out.println("\nWithdrawing everything in account...");
	beta.withdraw(beta.getBalance());
	beta.printBal();
  
  } // end main()
  
} // end class
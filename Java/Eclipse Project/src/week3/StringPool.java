package week3;
import java.lang.*;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str1 = "Hello";
			String str2 = "Hello";
			// STRING LITERAL METHOD
			if(str1 == str2) // not copying content of string, comparing the string REFERNECE
			{
				System.out.println("str1==str2");
			}
			else
			{
				System.out.println("Str1 != str2");
			}
			// STRING CONSTRUCTOR METHOD
			String str3 =  new String("Hello");
			String str4 = new String("Hello");
			
			if(str3 == str4) 
			{
				System.out.println("str3==str4");
			}
			else
			{
				System.out.println("Str3 != str4"); // NOT equal, because they have DIFFERENT references
			}
			
			if(str3.equals(str4))
			{
				System.out.println("str3 and str4 are equal");
			}
			else
			{
				System.out.println("str3 and str4 are not equal");
			}
			
			if(str3.compareTo(str4) == 0)
			{
				System.out.println("str3 and str4 are equal");
			}
			else
			{
				System.out.println("str3 and str4 are not equal");
			}
			
			if(str3.equalsIgnoreCase(str4))
			{
				System.out.println("str3 and str4 are equal");
			}
			else
			{
				System.out.println("str3 and str4 are not equal");
			}
		
	}

}

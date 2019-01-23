package week3;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str1 = "cat, cake, candy, coke";
			int len = str1.length();	
			
			System.out.println(len);
			System.out.println(str1.charAt(0));
			
			String str2 = str1.substring(5); // begins at index 5, goes to end of string
			System.out.println(str2);
	
			String str3 = str1.substring(5,9);
			System.out.println(str3);
			
			String str4 = str1.toUpperCase();
			System.out.println(str4);
			
			String str5 = str1.concat(", concatanation bitch");
			System.out.println(str5);
	
	}
}

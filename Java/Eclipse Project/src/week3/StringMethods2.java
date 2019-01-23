package week3;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Dog";
		String s2 = "Food";
		String s3 = s1.concat(s2);
		String s4 = s1 + s2; // note that concat and + do the same thing
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3); // note that s1 and s2 are unaffected
		System.out.println(s4);
		
		String str1 = "     Hello World     ";
		String str2 = str1.trim(); // trims whitespace
		System.out.println(str2);
		String str3 = str1.replace(' ', 'F'); // replace whitespace with 'F'
		System.out.println(str3);
		
		
		
	}

}

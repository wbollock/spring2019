package week3;

public class StringBuilderImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Strings are IMMutable
		String str1 = new String("Hello");
		str1.concat(" World"); // same as + operator, won't CHANGE THE STRING
		
		System.out.println("string1 is: " +str1);
		
		//StringBuilder is MUTABLE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println("Builder is: "+builder);
	}

}

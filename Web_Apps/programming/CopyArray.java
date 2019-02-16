public class CopyArray {

	public static void main(String[] args) {
	    /* Create a 5 element string array (str1)
	       Create a second string array (str2) based upon length of str1 array
	       Copy str1 array elements into str2
	       Print elements of both arrays using enchanced for loops */

	    String[] str1 = new String[5];

	    str1[0] = "C++";
	    str1[1] = "C";
	    str1[2] = "Java";
	    str1[3] = "Python";
	    str1[4] = "JSON;"

	    // sum each individual element with a for loop to get total length
	    // OR
	    // just make a damn second array

	    int arrayLength = str1.length;
	    
	    String[] str2 = new String[arrayLength]; // is this right??

	    for(int i = 0; i < arrayLength; i++) // copy elements of array into each other
		{
		    str2[i] = str1[i]; // deep copy
		}
	    
	    
	    
	  


	    // print elements of both Arrays;
	    System.out.println("Printing str1 array:");
	    for(String strtemp : str1)
		System.out.println(strtemp);

	    System.out.println("");
	    
	     System.out.println("Printing str2 array:");
	    for(String strtemp : str2)
		System.out.println(strtemp);
	    
	}

}

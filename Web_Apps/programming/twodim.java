public class twodim {

	public static void main(String[] args) {
	    //Q9 ex. 23 (two-dim array w/2 rows and 4 columns)
	    
	    int[][] myVals =
		{
		    {2, 4, 6, 8},
		    {20, 40, 60, 80}
		};
	    /*for(int i = 0; i < (myVals.length * 4); i++)
		{
		    System.out.println(myVals[i][i]);
		    } // end of for*/
	    System.out.println("Value of myVals[1][2] is: "+ myVals[1][2]);

	    //Q9 ex. 24
//(two-dim "jagged" array w/2 rows: row1: 3 columns, row2: 4 columns)
	    int[][] myVals2 =
		{
		    {2, 4, 6},
		    {1, 3, 5, 7}
		};
	    System.out.println("Value of myVals.length is: " + myVals2.length);


	    //Q9 ex. 25
	    //(two-dim "jagged" array w/3 rows: row1: 3 columns, row2: 3 columns, row3: 4 columns)
	    int[][] myVals3 =
		{
		    {2, 4, 6},
		    {1, 8, 9},
		    {1, 3, 5, 7}
		};

	    //Question: Using the above array, print the value of myVals[1].length.
	    System.out.println("Value of myVals[1].length is: " + myVals3[1].length);
	}

}

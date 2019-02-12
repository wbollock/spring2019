package week5;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for test review
		//calculate the sum of the multiples of 3 between 1 and 200
			
		int sum= 0;
		for(int i = 0; i <= 200; i++)
		{
			if(i % 3 == 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("The sum is : " + sum);
		
		
		
	}

}

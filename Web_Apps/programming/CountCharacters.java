import java.util.*;
public class CountCharacters {

	public static void main(String[] args) {
        System.out.println("Count number and types of characters on a user entered string. Using isLetter(), isDigit(), isSpaceChar()");
        System.out.println("Could also add counting uppercase versus lowercase characters");
        System.out.println("");

        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();

        System.out.println("");
        System.out.println("Your string " + userString + " has the following numbers and types of characters:");

        int letterSum=0;
        int spaceSum=0;
        int numberSum=0;
        int otherCharSum=0;

        for(int i =0; i<userString.length(); i++) // iterate through string
        {
            // if charAt 0 == Letter/Digit/Space, add to sum
            char sampleChar = userString.charAt(i);
            if(Character.isLetter(sampleChar) == true)
            {
                letterSum++;
            }
            else if(Character.isDigit(sampleChar) == true)
            {
                numberSum++;
            }
            else if(Character.isSpaceChar(sampleChar) == true)
            {
                spaceSum++;
            }
            else
                otherCharSum++;
                
        }

        System.out.println("letter(s): " + letterSum);
        System.out.println("space(s): " + spaceSum);
        System.out.println("number(s): " + numberSum);
        System.out.println("other character(s): " + otherCharSum);

    }

}
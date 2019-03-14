import java.util.*;
import java.io.*;
public class FileWriteReadCountWords {

	public static void main(String[] args) throws FileNotFoundException {
        // program captures user input, writes to and reads from same file
        // then counts number of words in file
        // use hasNext() to read number of words

        System.out.print("Please enter text: ");
        Scanner sc = new Scanner (System.in);
        String userString = sc.nextLine();
        String fileName = "filecountwords.txt";
        System.out.println("Saved to \"filecountwords.txt\"");
        // first, take in user input and and save it to a file
        try{
            FileWriter fstream = new FileWriter(fileName,true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(userString);
            out.close();
        }
        catch (Exception e)
        {
            System.err.println("Error while writing to file: " + e.getMessage());
        }


        // read from saved file using hasNext


      
       
       
            /*Scanner in = new Scanner(fileName);
            System.out.println("DEBUG: Start of second try/catch");
            int numWords=0; // num of words in file
            
            String x = null;
            while(x = fileName())
            {
                try{
                    in.hasNext();
                    numWords = numWords + 1;
                    System.out.println("WHILE LOOP!"); // infinitley repeating here
                }
                catch (Exception e)
                {
                    System.err.println("Error while reading from file: " + e.getMessage());
                }
            }*/

           
            try(Scanner fileSc = new Scanner(new FileInputStream(fileName))){
                int numWords=0;
                while(fileSc.hasNext()){
                    fileSc.next(); // ADVANCES file word
                    numWords++;
                }
            System.out.println("Number of words: " + numWords);
            }
            

            
        
        
    } // end of main

}
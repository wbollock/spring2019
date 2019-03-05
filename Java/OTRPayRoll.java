//Made by Will bollock
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class payRate { // inheritance
 static double milePay = 0.55;
}

public class OTRPayRoll extends payRate {

    interface createFile { // interface
        public void writeFile(String fileName, String empName, double empTips, double empHours, double TotalPay, double empMiles);
    }

    static class PrintingInfo implements createFile { // hides object details
        public void writeFile(String fileName, String empName, double empTips, double empHours, double TotalPay, double empMiles) {
            try{
             FileWriter fstream = new FileWriter(fileName,true);
                            BufferedWriter out = new BufferedWriter(fstream);
                            out.write(empName + " made $" + TotalPay);
                            out.newLine();
                            out.write(empName  + " had " + empHours + " hours, $" + empTips + 
                            		" tips, and " + empMiles + " miles.");
                            out.newLine();
                            out.write("------------------------------------");
                            out.newLine();
                            out.close();

            }
             catch (Exception e) 
                        { // FileNotFoundException ex
                            System.err.println("Error while writing to file: " + e.getMessage());
                        }
        }


    }
    public static void main(String[] args) {
    	OTRPayRollEncap encap = new OTRPayRollEncap(); // getters and setters
    	// encapusulation
    	PrintingInfo writeObject = new PrintingInfo();

    	   String dummyString = "";
          
           double empTotPay;

    
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the OTR Payroll program.");
        System.out.println("Please enter the name of the payroll text file:");
        encap.setFileName(sc.nextLine()); 
        

        System.out.println("Please enter the number of employees on this payroll:");
        
        int numEmp = sc.nextInt();
        
        


        for(int i =0; i<numEmp; i++)
        {
            // nextline is reading \n newline char, need dummy string to eat it up
            dummyString = sc.nextLine();
            System.out.println("Enter the employee's name:");
            //empName = sc.nextLine();
            encap.setEmpName(sc.nextLine());
            System.out.println("Enter the employee's pay rate:");
            encap.setPayRate(sc.nextDouble());
            System.out.println("Enter the employee's hours:");
            encap.setEmpHours(sc.nextDouble());
            System.out.println("Enter the employee's tips:");
            encap.setEmpTips(sc.nextDouble());
            System.out.println("Enter the employee's miles:");
            encap.setEmpMiles(sc.nextDouble());
            
            empTotPay = (Math.round(((encap.getEmpHours() * encap.getPayRate()) + 
            		(encap.getEmpMiles() * milePay) + encap.getEmpTips())* 10000d) / 10000d);
          
            writeObject.writeFile(encap.getFileName(), encap.getEmpName(), encap.getEmpTips(), encap.getEmpHours(), empTotPay, 
                            encap.getEmpMiles());
                      


                        
                        
            System.out.println("Employee number " + (i + 1) + " has been completed.");
            System.out.println("");
        } // end of for loop
/*
TODO:
Options for connectivity:
    1. Make Web App -> Database connectivity w/ MySQL local DB. Follow Jowett A2 to do this.
    2. Long switch statement
*/
    } // end of main

} // end of class 
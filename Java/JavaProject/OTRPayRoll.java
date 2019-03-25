//Made by Will Bollock
/* DONE: Encapsulation -> (vars set private) with getters/setters
/        Inheritance -> OTRPayRoll extends Payrate
         Abstract Class -> userInfo
         Accessors & Mutators -> getters/setters in encap
         Multiple Java Class Files -> OTRPayrollEncap.java, many classes there
         Method Overridng -> adding extra functionality with printText extends userInfo
         Overloading -> payrollCalc function, different based on # of parameters
        Paramterized constructor -> class name ParameterizedConstructor, intro text, parameter given in main
*/  
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class payRate { // inheritance
 static double milePay = 0.55;
}

class ParameterizedConstructor {
    String intro;

    ParameterizedConstructor(String str){
        intro = str;
    }
}



public class OTRPayRoll extends payRate {

    // overloading example, function changes based on parameters
    static double payrollCalc(double payrate, double hours){
        return payrate * hours;
    }
    static double payrollCalc(double payrate, double hours, double miles){
        return (payrate * hours) + (miles * 0.55);
    }
    static double payrollCalc(double payrate, double hours, double miles, double tips){
        return (payrate * hours) + (miles * 0.55) + tips;
    }

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
    
    static abstract class userInfo{ // abstraction -> static for objects
    	abstract void introText(); // method for printing user info
    	abstract void payrollText(); // name of payroll file
    	abstract void numEmployees();
    }
    
    static class printText extends userInfo{ // method Overriding -> implement extra functionality 
        void introText(){System.out.println("Welcome to the OTR Payroll program.");}
        void payrollText(){System.out.println("Please enter the name of the payroll text file:");}
        void numEmployees(){System.out.println("Please enter the number of employees on this payroll:");}        
    }

   
    public static void main(String[] args) {

        ParameterizedConstructor introString = new ParameterizedConstructor("This is the On The Rocks Payroll Program. Please enter employee name, pay rate, hours, tips, and miles when prompted.");
        System.out.println(introString.intro);

    	OTRPayRollEncap encap = new OTRPayRollEncap(); // getters and setters
    	// encapusulation
    	PrintingInfo writeObject = new PrintingInfo();
    	userInfo textOutput = new printText();
    
    	String dummyString = "";
        double empTotPay;
        Scanner sc = new Scanner(System.in);
        
    	textOutput.introText(); // intro text
    	
    	textOutput.payrollText(); // name of file
        encap.setFileName(sc.nextLine()); 
        
        textOutput.numEmployees(); // enter # of employees
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
            
            empTotPay = payrollCalc(encap.getEmpHours(), encap.getPayRate(), encap.getEmpMiles(), encap.getEmpTips());
            // rounding numbers
            empTotPay = Math.round((empTotPay * 10000d) / 10000d);

            /*empTotPay = (Math.round(((encap.getEmpHours() * encap.getPayRate()) + 
            		(encap.getEmpMiles() * milePay) + encap.getEmpTips())* 10000d) / 10000d);*/
          
            writeObject.writeFile(encap.getFileName(), encap.getEmpName(), encap.getEmpTips(), encap.getEmpHours(), empTotPay, 
                            encap.getEmpMiles());
                      


                        
                        
            System.out.println("Employee number " + (i + 1) + " has been completed.");
            System.out.println("");
        } // end of for loop
    } // end of main

} // end of class 
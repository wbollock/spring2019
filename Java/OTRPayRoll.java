//Made by Will bollock
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
public class OTRPayRoll {
    public static void main(String[] args) {
    	OTRPayRollEncap encap = new OTRPayRollEncap(); // getters and setters
    	// encapusulation
    	
    	   String dummyString = "";
           double milePay = 0.55;
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
            // rounding to 2 decimal places
            /*DecimalFormat df = new DecimalFormat("#.##");
            empTotPay = df.format(empTotPay);*/
            //encap.setEmpTotPay = (Math.round((encap.getEmpTotPay() * 10000d)) / 10000d);

                        try{
                        /*// Creating a File object that represents the disk file. 
                        PrintStream o = new PrintStream(new File("A.txt"), true); 
                
                        // Store current System.out before assigning a new value 
                        PrintStream console = System.out; 

                        // Assign o to output stream 
                        System.setOut(o); 
                        System.out.println(empName + " made $" + empTotPay);
                        
                        //set output back to console
                        System.setOut(console);*/

                            FileWriter fstream = new FileWriter(encap.getFileName(),true);
                            BufferedWriter out = new BufferedWriter(fstream);
                            out.write(encap.getEmpName() + " made $" + empTotPay);
                            out.newLine();
                            out.write(encap.getEmpName()  + " had " + encap.getEmpHours() + " hours, $" + encap.getEmpTips() + 
                            		" tips, and " + encap.getEmpMiles() + " miles.");
                            out.newLine();
                            out.write("------------------------------------");
                            out.newLine();
                            out.close();
                            }
                        catch (Exception e) 
                        { // FileNotFoundException ex
                            //System.out.println("Some sort of error occured with writing to the text file.");
                            System.err.println("Error while writing to file: " + e.getMessage());
                        }


                        
                        
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
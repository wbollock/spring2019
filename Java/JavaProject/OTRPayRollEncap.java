// made by Will Bollock
public class OTRPayRollEncap {

	// benefits of this encapsulation: more control over variable names
	// can do more with empName : example, add company name to all strings
	// cleans up original program

	
	// getters and setters
	   private String empName;
	   private String fileName;
	   private double payRate;
	   private double empHours;
	   private double empTotPay;
	   private double empMiles;
	   private double empTips;
	   
	   //getters
	   public String getEmpName() {
		   return empName;
	   }
	   
	   public String getFileName() {
		   return fileName;
	   }
	   
	   public double getPayRate() {
		   return payRate;
	   }
	   
	   public double getEmpHours() {
		   return empHours;
	   }
	   
	   public double getEmpTotPay() {
		   return empTotPay;
	   }
	   
	   public double getEmpMiles() {
		   return empMiles;
	   }
	   
	   public double getEmpTips() {
		   return empTips;
	   }
	   
	   
	   // setters
	   
	   public void setEmpName( String newEmpName ) {
		   empName = newEmpName;
	   }
	   
	   public void setFileName( String newFileName ) {
		   fileName = newFileName;
	   }
	   
	   public void setPayRate( double newPayRate ) {
		   payRate = newPayRate;
	   }
	   
	   public void setEmpHours( double newEmpHours ) {
		   empHours = newEmpHours;
	   }
	   
	   public void setEmpTotPay( double newEmpTotPay ) {
		   empTotPay = newEmpTotPay;
	   }
	   
	   public void setEmpMiles( double newEmpMiles ) {
		   empMiles = newEmpMiles;
	   }
	   
	   public void setEmpTips( double newEmpTips ) {
		   empTips = newEmpTips;
	   }
	   
	   
	  
}
	   
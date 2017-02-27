//Stephen Orsino
//Project version 2
//2/22/17
//PartTimeEmployee.java

/*This class inherits from the Employee class */
public class FullTimeEmployee extends Employee  {
private double annualSalary;
	
	//default constructor
	public FullTimeEmployee() {
		super();
		annualSalary = 0.0;
	}
	
	//parameter constructor
	public FullTimeEmployee(String fname, String lname, String social, String syear, String dept, String deptcode, double salary) {
		super(fname, lname, social, syear, dept, deptcode);
		annualSalary = salary;
	}
	
	//mutators
	public void setAnnualSalary(double salary) {
		annualSalary = salary;
	}
	
	
	//accessors
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	//method to calculate the weekly pay
	public double calculateWeeklyPay() {
		return this.getAnnualSalary() / 52;
	}
	
	public String toString() {
		String empInfo = "Employee Information:\n"
				+ "Employee Name: " + this.getFName() + " " + this.getLName() + "\n"
				+ "Employee SSN: \t" + this.getSocial() + "\n"
				+ "Employee ID: \t" + this.getIdNum() + "\n"
				+ "Employee Start Year:\t" + this.getSYear() + "\n"
				+ "Employee Department: " + this.getDept() + "\n"
				+ "Department Code: " + this.getDeptCode() + "\n"
				+ "Pay Rate: " + this.getAnnualSalary() + " per year\n";
		
		return empInfo;
	}

}

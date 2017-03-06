//Stephen Orsino
//Project version 2
//2/22/17
//PartTimeEmployee.java

/*This class inherits from the Employee class */
public class PartTimeEmployee extends Employee {
	private double weeklyHoursWorked, hourlyRate;
	
	//default constructor
	public PartTimeEmployee() {
		super();
		weeklyHoursWorked = 0.0;
		hourlyRate = 0.0;
	}
	
	//parameter constructor
	public PartTimeEmployee(String fname, String lname, String social, String syear, String dept, String deptcode, double weekhrs, double hrate) {
		super(fname, lname, social, syear, dept, deptcode);
		weeklyHoursWorked = weekhrs;
		hourlyRate = hrate;
	}
	
	//mutators
	public boolean setWeeklyHoursWorked(double weekhrs) {
		if (weekhrs > 0.0)
			weeklyHoursWorked = weekhrs;
		else 
			System.out.println("The value must be grater than 0");
		return (weekhrs > 0.0);
	}
	public boolean setHourlyRate(double hrate) {
		if (hrate > 0.0)
			hourlyRate = hrate;
		else 
			System.out.println("The value must be grater than 0");
		return (hrate > 0.0);
	}
	
	//accessors
	public double getWeeklyHoursWorked() {
		return weeklyHoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	//method to calculate the weekly pay
	public double calculateWeeklyPay() {
		if (this.getWeeklyHoursWorked() <= 40.0) {
			return this.getWeeklyHoursWorked() * this.getHourlyRate(); 
		} else {
			double tempHrs = 0.0;
			double tempPay = this.getHourlyRate() * 40;
			tempHrs += (this.getWeeklyHoursWorked() - 40.0);
			tempPay += (tempHrs * 1.5);
			return tempPay;
		} 
	}
	
	public String toString() {
		String empInfo = "Employee Information:\n"
				+ "Employee Name: " + this.getFName() + " " + this.getLName() + "\n"
				+ "Employee SSN: \t" + this.getSocial() + "\n"
				+ "Employee ID: \t" + this.getIdNum() + "\n"
				+ "Employee Start Year:\t" + this.getSYear() + "\n"
				+ "Employee Department: " + this.getDept() + "\n"
				+ "Department Code: " + this.getDeptCode() + "\n"
				+ "Pay Rate: " + this.getHourlyRate() + " per hour\n";
		
		return empInfo;
	}
}

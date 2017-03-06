//Stephen Orsino
//Kyle Hunter
//Driver Class for Project 1
//The purpose of this program is to test all methods of the Employee class

//for user input
import java.util.Scanner;

public class EmployeeTester {
	public static void main (String args[]) {
		//Create two instances of PartTimeEmployee with the two constructors
		PartTimeEmployee myPtEmployee = new PartTimeEmployee();
		PartTimeEmployee myPtEmployee2 = new PartTimeEmployee("Steve", "Orsino", "111-11-1111", "2152","IT", "IT156", 35.0, 15.0);
		
		//Create two instances of FullTimeEmployee with the two constructors
		FullTimeEmployee myFtEmployee = new FullTimeEmployee();
		FullTimeEmployee myFtEmployee2 = new FullTimeEmployee("Kyle", "Hunter", "111-11-1111", "2152","IT", "IT156", 50000.0);
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		//declare variables for attributes
		String fName, lName, soc, sYear, dep, depCode;
		double wkHrs = 0.0, hRate = 0.0, yrSal = 0.0;
		
		//test constructors and toString methods
		System.out.println("\tDisplaying PartTimeEmployee default constructor:");
		System.out.println(myPtEmployee);
		System.out.println("\n\tDisplaying PartTimeEmployee parameter constructor: ");
		System.out.println(myPtEmployee2);
		
		//test constructors and toString methods
		System.out.println("\tDisplaying FullTimeEmployee default constructor:");
		System.out.println(myFtEmployee);
		System.out.println("\n\tDisplaying FullTimeEmployee parameter constructor: ");
		System.out.println(myFtEmployee2);
		
		//create another instance of PartTimeEmployee for accessors and mutators
		PartTimeEmployee myPtEmployee3 = new PartTimeEmployee();
		System.out.println("\tDisplaying accessors and mutators: ");
		System.out.print("Please Enter the first name of the new PartTimeEmployee: ");
		fName = input.nextLine();
		myPtEmployee3.setFName(fName);
		System.out.println("You entered: " + myPtEmployee3.getFName());
		
		System.out.print("Please Enter the last name of the new PartTimeEmployee: ");
		lName = input.nextLine();
		myPtEmployee3.setLName(lName);
		System.out.println("You entered: " + myPtEmployee3.getLName());
		
		System.out.print("Please Enter the SSN name of the new PartTimeEmployee: ");
		soc = input.nextLine();
		myPtEmployee3.setSocial(soc);
		System.out.println("You entered: " + myPtEmployee3.getSocial());
		
		System.out.print("Please Enter the start year of the new PartTimeEmployee: ");
		sYear = input.nextLine();
		myPtEmployee3.setSYear(sYear);
		System.out.println("You entered: " + myPtEmployee3.getSYear());
		
		System.out.print("Please Enter the department of the new PartTimeEmployee: ");
		dep = input.nextLine();
		myPtEmployee3.setDept(dep);
		System.out.println("You entered: " + myPtEmployee3.getDept());
		
		System.out.print("Please Enter the department code of the new PartTimeEmployee: ");
		depCode = input.nextLine();
		myPtEmployee3.setDeptCode(depCode);
		System.out.println("You entered: " + myPtEmployee3.getDeptCode());
		
		
		do {
			System.out.print("Please Enter the weekly hours worked of the new PartTimeEmployee: ");
			wkHrs = input.nextDouble();
			input.nextLine();
			myPtEmployee3.setWeeklyHoursWorked(wkHrs);
		} while (!(myPtEmployee3.setWeeklyHoursWorked(wkHrs)));
		System.out.println("You entered: " + myPtEmployee3.getWeeklyHoursWorked());
		
		do {
			System.out.print("Please Enter the hourly pay rate of the new PartTimeEmployee: ");
			hRate = input.nextDouble();
			input.nextLine();
			myPtEmployee3.setHourlyRate(hRate);
		} while (!(myPtEmployee3.setHourlyRate(hRate)));
		
		System.out.println("You entered: " + myPtEmployee3.getHourlyRate());
		
		System.out.println("Your PartTimeEmployee makes $" + myPtEmployee3.calculateWeeklyPay() + " Per Week");
		
		System.out.println("\nYour new PartTimeEmployee...");
		System.out.println(myPtEmployee3);
		
		
		//create another instance of PartTimeEmployee for accessors and mutators

		FullTimeEmployee myFtEmployee3 = new FullTimeEmployee();
		System.out.println("\tDisplaying accessors and mutators: ");
		System.out.print("Please Enter the first name of the new FullTimeEmployee: ");
		fName = input.nextLine();
		myFtEmployee3.setFName(fName);
		System.out.println("You entered: " + myFtEmployee3.getFName());
		
		System.out.print("Please Enter the last name of the new FullTimeEmployee: ");
		lName = input.nextLine();
		myFtEmployee3.setLName(lName);
		System.out.println("You entered: " + myFtEmployee3.getLName());
		
		System.out.print("Please Enter the SSN name of the new FullTimeEmployee: ");
		soc = input.nextLine();
		myFtEmployee3.setSocial(soc);
		System.out.println("You entered: " + myFtEmployee3.getSocial());
		
		System.out.print("Please Enter the start year of the new FullTimeEmployee: ");
		sYear = input.nextLine();
		myFtEmployee3.setSYear(sYear);
		System.out.println("You entered: " + myFtEmployee3.getSYear());
		
		System.out.print("Please Enter the department of the new FullTimeEmployee: ");
		dep = input.nextLine();
		myFtEmployee3.setDept(dep);
		System.out.println("You entered: " + myFtEmployee3.getDept());
		
		System.out.print("Please Enter the department code of the new FullTimeEmployee: ");
		depCode = input.nextLine();
		myFtEmployee3.setDeptCode(depCode);
		System.out.println("You entered: " + myFtEmployee3.getDeptCode());
		
		do {
		System.out.print("Please Enter the annual salary of the new FullTimeEmployee: ");
		yrSal = input.nextDouble();
		myFtEmployee3.setAnnualSalary(yrSal);
		} while (!(myFtEmployee3.setAnnualSalary(yrSal)));
		System.out.println("You entered: " + myFtEmployee3.getAnnualSalary());
		
		System.out.println("Your FullTimeEmployee makes $" + myFtEmployee3.calculateWeeklyPay() + " Per Week");
		
		System.out.println("\nYour new FullTimeEmployee...");
		System.out.println(myFtEmployee3);
		
		
		input.close();
	}
}

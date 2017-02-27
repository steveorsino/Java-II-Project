//Stephen Orsino
//Kyle Hunter
//Driver Class for Project 1
//The purpose of this program is to test all methods of the Employee class

//for user input
import java.util.Scanner;

public class EmployeeTester {
	public static void main (String args[]) {
		//Create two instances of Employee with the two constructors
		Employee myEmployee = new Employee();
		Employee myEmployee2 = new Employee("Steve", "Orsino", "111-11-1111", "2152","IT", "IT156");
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		//declare variables for attributes
		String fName, lName, soc, sYear, dep, depCode;
		
		//test constructors and toString methods
		System.out.println("\tDisplaying Employee default constructor:");
		System.out.println(myEmployee.toString());
		System.out.println("\n\tDisplaying Employee parameter constructor: ");
		System.out.println(myEmployee2.toString());
		
		//create another instance of Employee for accessors and mutators
		Employee myEmployee3 = new Employee();
		System.out.println("\tDisplaying accessors and mutators: ");
		System.out.print("Please Enter the first name of the new Employee: ");
		fName = input.nextLine();
		myEmployee3.setFName(fName);
		System.out.println("You entered: " + myEmployee3.getFName());
		
		System.out.print("Please Enter the last name of the new Employee: ");
		lName = input.nextLine();
		myEmployee3.setLName(lName);
		System.out.println("You entered: " + myEmployee3.getLName());
		
		System.out.print("Please Enter the SSN name of the new Employee: ");
		soc = input.nextLine();
		myEmployee3.setSocial(soc);
		System.out.println("You entered: " + myEmployee3.getSocial());
		
		System.out.print("Please Enter the start year of the new Employee: ");
		sYear = input.nextLine();
		myEmployee3.setSYear(sYear);
		System.out.println("You entered: " + myEmployee3.getSYear());
		
		System.out.print("Please Enter the department of the new Employee: ");
		dep = input.nextLine();
		myEmployee3.setDept(dep);
		System.out.println("You entered: " + myEmployee3.getDept());
		
		System.out.print("Please Enter the department code of the new Employee: ");
		depCode = input.nextLine();
		myEmployee3.setDeptCode(depCode);
		System.out.println("You entered: " + myEmployee3.getDeptCode());
		
		
		System.out.println("\nYour new Employee...");
		System.out.println(myEmployee3.toString());
		input.close();
	}
}

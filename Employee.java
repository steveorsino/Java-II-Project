//Stephen Orsino
//Kyle Hunter
//Programming II Version 1
//2/1/17
public class Employee {
	//Declare attributes
	private	String First_Name, Last_Name, ID_Num, Social, Start_Year, Dept, Dept_Code;
	
	//Define id number generator
	private String CreateIdNumber() {
		//create variables to hold data
		String idNum = "";
		int myInt = 0;
		//get first and last name initials into id number
		idNum += this.First_Name.charAt(0);
		idNum += this.Last_Name.charAt(0);
		//add dash to id number
		idNum += "-";
		//use for loop for 4 random integers
		for (int i = 0;i < 4; i++) {
			//get random double 0 - 9
			double myDouble = Math.random() * 10;
			//cast to int
			myInt = (int)myDouble;
			//add to id
			idNum += myInt;
		}
		return idNum;
	}
	
	//Default Constructor
	public Employee() {
		First_Name = "John";
		Last_Name = "Doe";
		Social = "xxx-xx-xxxx";
		Start_Year = "1900";
		Dept = "Unknown";
		Dept_Code = "Unknown";
		ID_Num = CreateIdNumber();
	}
	//parameter constructor
	public Employee(String fname, String lname, String social, String syear, String dept, String deptcode) {
		First_Name = fname;
		Last_Name = lname;
		Social = social;
		Start_Year = syear;
		Dept = dept;
		Dept_Code = deptcode;
		ID_Num = CreateIdNumber();	
	}
	//Redefine toString method
	public String toString() {
		String empInfo = "Employee Information:\n"
				+ "Employee Name: " + this.getFName() + " " + this.getLName() + "\n"
				+ "Employee SSN: \t" + this.getSocial() + "\n"
				+ "Employee ID: \t" + this.getIdNum() + "\n"
				+ "Employee Start Year:\t" + this.getSYear() + "\n"
				+ "Employee Department: " + this.getDept() + "\n"
				+ "Department Code: " + this.getDeptCode() + "\n";
		
		return empInfo;
	}
	//mutator methods
	public void setFName(String fname) {
		First_Name = fname;
		this.ID_Num = CreateIdNumber();
	}
	public void setLName(String lname) {
		Last_Name = lname;
		this.ID_Num = CreateIdNumber();
	}
	public boolean setSocial(String social) {
		boolean flag = false;
		if (social.length() == 10) {
			for (int i = 0; i < 3; i++) {
				if (!Character.isDigit(social.charAt(i))) {
					System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
					return flag;
				}
			}
			if (social.charAt(3) != '-') {
				System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
				return flag;
			}
			if (!Character.isDigit(social.charAt(4))) {
				System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
				return flag;
			}
			if (!Character.isDigit(social.charAt(5))) {
				System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
				return flag;
			}
			if (social.charAt(6) != '-') {
				System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
				return flag;
			}
			for (int i = 7; i < 11; i++) {
				if (!Character.isDigit(social.charAt(i))) {
					System.out.println("The SSN must be in the form 'xxx-xx-xxxx'");
					return flag;
				}
			}
			flag = true;
		} else {
			return flag;
		}
		Social = social;
		return flag;
	}
	public void setSYear(String syear) {
		Start_Year = syear;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public void setDeptCode(String deptcode) {
		Dept_Code = deptcode;
	}
	//accessor methods
	public String getFName() {
		return First_Name;
	}
	public String getLName() {
		return Last_Name;
	}
	public String getIdNum() {
		return ID_Num;
	}
	public String getSocial() {
		return Social;
	}
	public String getSYear() {
		return Start_Year;
	}
	public String getDept() {
		return Dept;
	}
	public String getDeptCode() {
		return Dept_Code;
	}
}

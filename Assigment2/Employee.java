package Assigment1;

import java.util.Scanner;

public class Employee {
	
	Scanner sc= new Scanner(System.in);
	
	private String department,name;
	private int employeeID;
	private double salary;

public Employee() {
	
	System.out.println("=====================================================================");
	System.out.println("Employee Info");
	System.out.println("=====================================================================");
	System.out.println("Please enter the details: ");
	
	System.out.print("Department\t\t: ");
	this.department = sc.nextLine();
	
	System.out.print("Employee Name\t\t: ");
	this.name = sc.nextLine();	
	
	System.out.print("Employee ID\t\t: ");
	this.employeeID = sc.nextInt();
	
	System.out.print("Salary\t\t\t: RM ");
	this.salary = sc.nextDouble();
	
}
public String getDepartment() {
	return this.department;
}
public String getEmployeeName() {
	return this.name;
}
public int getEmployeeId() {
	return this.employeeID;
}
public double getSalary() {
	return this.salary;
	
}
public Employee(String cn, String l,String c, String t,String d,String n,int id,double s) {
	super(cn,l,c,t);
	this.department=d;
	this.name=n;
	this.employeeID=id;
	this.salary=s;
	
	System.out.println("Employee Details ");
	
	System.out.print("Department\t\t\t: "+d);
	System.out.print("Employee Name\t\t\t: "+n);
	System.out.print("Employee ID\t\t\t: "+id);
	System.out.print("Salary\t\t\t\t   : RM "+s);
}
public String toString() {
		return  "\n====================================================================="+
				"\n Employee Information"+
				"\n====================================================================="+
				"\n Department\t\t: "+ department+
				"\n Employee Name\t\t: " + name +
				"\n Employee ID \t\t: " + employeeID + 
				"\n Salary \t\t: RM" + salary ;
				

}
}
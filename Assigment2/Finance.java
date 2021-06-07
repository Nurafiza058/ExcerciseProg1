package Assigment1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Finance extends Employee{

	Scanner sc= new Scanner(System.in);
	
	private double employeeSalary,utilityFee,adsFee,prize,registrationFee;
	private int employeeQuantity,participantQuantity;

public Finance() {
	
	System.out.println("Finance Information");
	System.out.println("=====================================================================");
	System.out.println("Please fill int the information");
	
	System.out.print("\nEmployee Salary\t\t\t: RM ");
	this.employeeSalary = sc.nextDouble();
	
	System.out.print("Utility Fee budget\t\t: RM ");
	this.utilityFee = sc.nextDouble();
	
	System.out.print("Advertisement Fee budget\t: RM ");
	this.adsFee = sc.nextDouble();
	
	System.out.print("Prize budget\t\t\t: RM ");
	this.prize = sc.nextDouble();
	
	System.out.print("Registration Fee\t\t: RM ");
	this.registrationFee = sc.nextDouble();
	
	System.out.print("Quantity of Employee\t\t: ");
	this.employeeQuantity = sc.nextInt();
	
	System.out.print("Quantity of Participant\t\t: ");
	this.participantQuantity = sc.nextInt();
	
}
public Finance(double util, double a, double p) {
	this.utilityFee = util;
	this.adsFee = a;
	this.prize = p;
	
	System.out.println("\nThe details are: ");
	System.out.println("Utility Fee\t\t   : RM " + util);
	System.out.println("Advertisement Fee\t   : RM " + a);
	System.out.println("Prize budgeted\t\t\t   : RM " + p);

}

public double getUtilityFee() {
	return this.utilityFee;
}

public double getAdvertisement() {
	return this.adsFee;
}

public double getPrize() {
	return this.prize;
}

public double getEmployeeSalary() {
	return this.employeeSalary;
}

public int getEmployeeQuantity() {
	return this.employeeQuantity;
}

public double getRegistrationFee() {
	return this.registrationFee;
}

public int getParticipantQuantity() {
	return this.participantQuantity;
}

public double totalSalary() {
	return this.employeeSalary * this.employeeQuantity;
}

public double totalIncome() { 
	return this.registrationFee * this.participantQuantity;
}

public double totalBudget() {
	return (totalSalary() + this.utilityFee + this.adsFee + this.prize);
}

public double calcNetProfit() {
	return totalIncome() - totalBudget();
}

public String toString() {
	return 	"\n=====================================================================" + 
			"\n Finance Details" +
			"\n=====================================================================" + 
			"\n Employee Quantity\t: " + employeeQuantity + 
			"\n Salary \t\t: RM " +employeeSalary +
			"\n Participant Quantity \t: " + participantQuantity +
			"\n Registration Fee \t: RM " + registrationFee +
			"\n Prize up to \t\t: RM " + prize +
			"\n Utility Fee \t\t: RM " + utilityFee +
			"\n Advertisement Fee \t: RM " + adsFee + 
			"\n=====================================================================" + 
			"\n Total Budget \t\t: RM " + totalBudget() +
			"\n Total Income\t\t: RM "+ totalIncome()+
			"\n=====================================================================" + 
			"\n Net Profit\t\t: RM "+ calcNetProfit()+
			"\n=====================================================================";
}


}
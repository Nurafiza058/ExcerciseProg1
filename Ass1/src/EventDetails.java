package Assigment1;

import java.util.Scanner;

public class EventDetails {

	Scanner sc= new Scanner(System.in);
	
	String category,court;
	double registrationfee=50;
	
public EventDetails() {
System.out.println("KnBasketball 2021 Event");

System.out.print("Category (3v3/5v5)\t\t: ");
this.category=sc.next();

System.out.print("Court (full/half)\t\t: ");
this.court=sc.next();

}


public EventDetails(String c,String crt,String t,double regf) {
	
	System.out.println("Event Details");
	System.out.println("Category (3v3 or 5v5)\t\t\t: "+c);
	System.out.println("Court (full court or half court)\t: "+crt);
	System.out.println("Registration Fee\t: RM"+regf);
	
}
	public String getCategory() {
		return this.category;
	}
	public String getCourt() {
		return this.court;
	}
	
	public double getRegistrationFee() {
		return this.registrationfee;
	}
	public String toString() {
		return"\n====================================================================="+
				"\n Event Details Information"+
				"\n====================================================================="+
				"\n Category\t\t: " + category +
				"\n Court\t\t\t: " + court+ 
				"\n Registration Fee\t: RM"+ registrationfee;
	}
	public String printDifference(){
		return"\n=====================================================================\n"
				+ "Difference 3v3 than 5v5\r\n"
				+ "1. 3v3 Basketball is much faster.\r\n"
				+ "2. Less endurance and more agility.\r\n"
				+ "3. Formation and defensice structure.\r\n"
				+ "4. Individual play more than teamwork"
				;
		
	}
	public String print5v5Rules() {
		return "\n=====================================================================\n"
				+"5v5 Basic Rules\n"
				+"1. 1 timeout per half\n"
				+"2. No dunking\n"
				+"3. Personal Fouls are not tracked, but do count towards team fouls\n"
				+"4. Clock does NOT stop in the 1st half\n"
				+"5. Clock stops in the 2nd half in the last 2 minutes \n"
				+ "ONLY if a team is losing by 10 points or less";

	}
	public String print3v3Rules() {
		return "\n=====================================================================\n"
				+"3v3 Basic Rules\n"
				+"1.Each game will be to 21 points or 15 minutes long. "
				+ "The team must win by only one point.\n"
				+"2.Teams score by either regular two-point baskets,\n "
				+ "or by three-point shots taken from outside the three-point circle.\n"
				+"3.All held balls will be put into play behind the three-point line \n"
				+ "with possession given alternately to each team.\n"
				+"4. Each team is only allowed one 30-second timeout under the last minute of play.\n"
				+"However, once a team reaches 15 points they will be in the bonus.\n"
				+"Every foul committed against the offense will result in free throws.";
			
	}
}
package Assigment1;

import java.util.Scanner;

public class Participant extends EventDetails{
	
	Scanner sc= new Scanner(System.in);
	
	String name,gender,teamName;
	int age,numOfParticipant;
	
	public Participant(){
		super();
		System.out.println("=====================================================================");
		System.out.println("Participant Info");
		System.out.println("=====================================================================");
		System.out.println("Please fill the information");
		
		System.out.print("Name\t\t\t: ");
		this.name=sc.nextLine();
		
		System.out.print("Gender\t\t\t: ");
		this.gender=sc.nextLine();
		
		System.out.print("Age\t\t\t: ");
		this.age=sc.nextInt();
		
		System.out.print("Enter your team name\t: ");
		this.teamName=sc.next();
		
		System.out.print("Number of Participant\t: ");
		this.numOfParticipant=sc.nextInt();
		
		
	}
	public Participant(String tn) {
		this.name=tn;
		
		System.out.println("Team Name\t: " + tn);
		
	}
	public Participant(String n, String g,int a, int num,String tn) {
		
		
		System.out.println("Name\t\t\t: "+ n);
		System.out.println("Gender\t\t\t: "+ g);
		System.out.println("Age\t\t\t: "+ a);
		System.out.println("Enter your team name\t: " +tn);
		System.out.println("Number of Participant\t: "+ num);
		
		
	}
	public String getParticipantName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public String getTeamName() {
		return this.teamName;
	}
	public int getNumberParticipant() {
		return this.numOfParticipant;
		
	}
	public String toString() {
		return  "\n====================================================================="+
				"\n Participant Information"+
				"\n====================================================================="+
				"\n Name\t\t\t: "+ name +
				"\n Gender\t\t\t: " + gender +
				"\n Age \t\t\t: " + age + 
				"\n Team Name\t\t: " + teamName +
				"\n Number of participant\t: " +numOfParticipant;
	}
}

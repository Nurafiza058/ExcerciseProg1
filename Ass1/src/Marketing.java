package Assigment1;
import java.util.Scanner;
public class Marketing {
	
	Scanner sc = new Scanner(System.in);
	
	String day;
	int prize;
	double registrationFee,discount;
		
	public Marketing() {
		System.out.println("=====================================================================");
		System.out.println("Prize Info");
		System.out.println("=====================================================================");
		
		System.out.print("Day\t\t\t: ");
		this.day= sc.nextLine();
		
		System.out.print("Prize\t\t\t: RM");
		this.prize= sc.nextInt();
		
		System.out.print("Registration Fee\t: RM");
		this.registrationFee= sc.nextDouble();
}
public Marketing(int p,double reg) {
	
	this.prize = p;
	this.registrationFee = reg;
	
	System.out.println("=====================================================================");
	System.out.println("Prizes ");
	System.out.println("Prize\t\t\t: RM " + p);
	System.out.println("Registration Fee\t: RM " + reg);
	
}
	
	public int getPrize() {
		return this.prize;
	}
	public String getDay() {
		return this.day;
	}
	
	public double getRegistrationFee() {
		return this.registrationFee;
	}
	public  double weekendPrice(){
		return this.registrationFee;
	}
	public  double weekendPrice(double discount){
		return this.registrationFee*(1-discount);
	}
	public  double weekendPrice(String day, double discount){
		
		if(day.equals("Friday")) {
			System.out.println("Special Price in Weekend for 20% ");
			return weekendPrice(0.2);
		}
		else if(day.equals("Saturday")) {
			System.out.println("Special Price in Weekend for 20% ");
			return weekendPrice(0.2);
		}
		else {
			System.out.println("Normal Price");
		}
		return weekendPrice(0.2);
	}
	public String printAds(){
		return"\n=====================================================================\n"
				+"KnBasketball 2021 Event\n"
				+"Registration Fee is only RM"+registrationFee
				+"\nThe Champion of this event will receive prize up to RM"+prize
				+"\n20% Discount if register during weekend"
				+"\nAll teams will get prizes"
				;
	}
public String toString() {
	return"\n====================================================================="+
			"\n Marketing Details Information"+
			"\n====================================================================="+
			"\n Prize\t\t\t: RM" + this.prize +
			"\n Day\t\t\t: " + this.day+ 
			"\n Registration Fee\t: RM"+ this.registrationFee+
			"\n Discount for weekend\t: RM" + this.weekendPrice(day, discount)+ 
			"\n=====================================================================";
}
}
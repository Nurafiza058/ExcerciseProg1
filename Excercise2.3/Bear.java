package Exercise22;

import java.util.Scanner;

public class Bear {
	
	
	Scanner sc= new Scanner(System.in);
	

	String habitat;
	int weight;
	double tall;
	String color;
	char endangered;
	String trophiclevel; 
	String typeofanimal;
	int population;
	
	void printSpec () {
		System.out.println("Habitat : ");
		habitat =sc.next();
		System.out.println("Color :" );
		color =sc.next();
		System.out.println("Trophic Level :" );
		trophiclevel =sc.next();
		System.out.println("Type of animal :" );
		typeofanimal =sc.next();
	
		System.out.println("Population :");
		population=sc.nextInt();
		System.out.println("Endangered :");
		endangered= sc.next().charAt(0);
		
		System.out.println();
		calBMI();
		populate (population);
		tall (tall);
		donation();
		
		System.out.println();
		System.out.println("**********************************************");
	}
	
	double calBMI() {
		System.out.println("Height : ");
		tall=sc.nextInt();
		System.out.println("Weight :");
		weight=sc.nextInt();
		double total = weight / (tall*tall);
		System.out.println("BMI :" + total);
		return total;
		
	} 
	void populate (int p) {
		System.out.println("How many population left?");
		int answer =sc.nextInt();
		
		if (answer <= 2500) {
			System.out.println("Endangered Species!!!!");
		}
		else
			System.out.println("Not Endangered Species.");
		System.out.println();
	}
	void tall (double t) {
		System.out.println("If the bear is standing the height is " + t + "meters");
	
		System.out.println();
	}
	void donation(){
		
		System.out.println("Is it true that you found this bear?");
		boolean donates = sc.nextBoolean();
		if (donates == true){
		System.out.println("Where did you found it?");
		String found = sc.next();
		System.out.println("You found a bear at "+ found);}
		else
			System.out.println("Thank you for participating");
	}
	
	}
		
	

		
		
		
	
	
	




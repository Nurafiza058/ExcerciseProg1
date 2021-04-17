package Exercise3;
import java.util.Scanner;
public class Lamp {
	
	String brand,typeoflamp,colour ;
	int  height, bulb;
	char usb;
	double price,cable;
	Scanner sc = new Scanner(System.in);
		
	//default constructor
	Lamp() {
		System.out.println("Brand name:");
		this.brand = sc.next();
		sc.nextLine();
		System.out.println("Type of lamp:");
		this.typeoflamp = sc.nextLine();
		
		System.out.println("Enter Colour:");
		this.colour = sc.nextLine();
		
		System.out.println("Enter Height");
		this.height= sc.nextInt();
		
		System.out.println("Enter bulb watt :");
		this.bulb= sc.nextInt();
		
		System.out.println("Does it have USB port? :");
		this.usb=sc.next().charAt(0);
		
		System.out.println("Enter Price :");
		this.price = sc.nextDouble();
		
		System.out.println("Enter Cable Length");
		this.cable= sc.nextDouble();

	
	
	}
		//Parameterized constructor
		Lamp(String b, String tol, String c,int h, int blb, char u, double p, double ca){
	
			this.brand=b;
			this.typeoflamp=tol;
			this.colour=c;
			this.height=h;
			this.bulb=blb;
			this.usb=u;
			this.price=p;
			this.cable=ca;
		
	}
	}
	

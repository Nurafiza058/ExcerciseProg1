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
	
	
	/*
	Lamp(String tol,String m , String c, double p, int h, int b, char usb, double cab ){
		typeoflamp =tol;
		model =m;
		colour =c;
		price =p;
		height =h;
		bulb =b;
		
		System.out.println();
		System.out.println("Type of lamp \t\t: "+tol);
		System.out.println("Brand \t\t\t: "+m);
		System.out.println("Color \t\t\t: "+c);
		System.out.println("Voltage \t\t: RM "+p );
		System.out.println("Height \t\t\t: "+h+"cm");
		System.out.println("Bulb \t\t\t: "+b+"Watt");
		System.out.println("Does it have USB port \t: "+ usb);
		System.out.println("How long is the cable \t: "+ cab+" meter");
		System.out.println();
	}

	}
*/

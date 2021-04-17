package Exercise3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Lamp a = new Lamp();

	System.out.println();
	System.out.println("Brand \t\t\t: "+a.brand);
	System.out.println("Type of lamp \t\t: "+a.typeoflamp);
	System.out.println("Color \t\t\t: "+a.colour);
	System.out.println("Height \t\t\t: "+a.height+"cm");
	System.out.println("Bulb \t\t\t: "+a.bulb+"Watt");
	System.out.println("Does it have USB port \t: "+a.usb );
	System.out.println("Price \t\t\t: RM "+ a.price);
	System.out.println("How long is the cable \t: "+ a.cable +" meter");
	System.out.println();
	
	Lamp b = new Lamp("IKEA","Desk Lamp","White",22,40,'Y',23.50,0.9);
	
	System.out.println();
	System.out.println("Brand \t\t\t: "+ b.brand);
	System.out.println("Type of lamp \t\t: "+ b.typeoflamp);
	System.out.println("Color \t\t\t: "+b.colour);
	System.out.println("Height \t\t\t: "+b.height+"cm");
	System.out.println("Bulb \t\t\t: "+b.bulb+"Watt");
	System.out.println("Does it have USB port \t: "+ b.usb);
	System.out.println("Price \t\t\t: RM "+ b.price );
	System.out.println("How long is the cable \t: "+b.cable +" meter");
	System.out.println();
			

		}

	}



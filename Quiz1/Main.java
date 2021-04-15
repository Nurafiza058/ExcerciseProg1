package Quiz1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen a = new Pen();
		Pen b = new Pen();
		
		
		a.setBrand("Faber Castel");
		a.setmodel("XE234");
		a.setColor("Blue");
		a.setquantity(10);
		a.settipsize(0.7);
		
		b.setBrand("Pentel");
		b.setmodel("Energel");
		b.setColor("Black");
		b.setquantity(10);
		b.settipsize(0.5);
		
		 System.out.println("Brand name: "+a.getBrand());
		 System.out.println("Model name: "+a.getmodel());
		 System.out.println("Color: "+a.getColor());
		 System.out.println("Quantity: "+a.getquantity());
		 System.out.println("Tip size: "+a.gettipsize());
		 System.out.println();
		 System.out.println("Brand name: "+b.getBrand());
		 System.out.println("Model name: "+b.getmodel());
		 System.out.println("Color: "+b.getColor());
		 System.out.println("Quantity: "+b.getquantity());
		 System.out.println("Tip size: "+b.gettipsize());
	}

}

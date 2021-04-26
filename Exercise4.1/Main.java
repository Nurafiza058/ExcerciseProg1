package Exercise;

public class Main {

	public static void main(String[] args) {
	
		
		Apple b = new Apple("Apple", 12, 2);
		System.out.println("Quantity\t\t: "+b.quantity());
		System.out.println("Price\t\t\t: RM "+b.price());
		System.out.println("Total price\t\t: RM "+b.buyApple() );
		
		System.out.println();
		
		RedApple c = new RedApple("Red Apple","Sweet", 1, 2);
		System.out.println("Taste\t\t\t: "+ c.flavour());
		System.out.println("Quantity\t\t: "+ c.redquantity());
		System.out.println("Price\t\t\t: RM "+ c.price());
		
		System.out.println();
		
		GreenApple d = new GreenApple("Green Apple", "Sour", 1, 2.5);
		System.out.println("Taste\t\t\t: "+d.flavour());
		System.out.println("Quantity\t\t: "+d.greenquantity());
		System.out.println("Price\t\t\t: RM "+d.price());

		System.out.println();
		
		DragonFruit e = new DragonFruit("Dragon Fruit", 7, 20);
		System.out.println("Price per kg\t\t: RM "+e.priceperkg());
		System.out.println("Total Price\t\t: RM "+e.totalprice());
		
		System.out.println();
		
		Watermelon f = new Watermelon("Watermelon",'N', 10);
		System.out.println("Did it have seeds?\t: "+f.seeds());
		System.out.println("Weight \t\t\t: "+f.weight()+"kg");
		System.out.println();
		

		

	}

}

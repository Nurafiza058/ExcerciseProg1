package Exercise4p6;

public class Apple extends Fruit{
	
	private static String name;
	private int quantity;
	private double price;
	public Apple(String name, int q, double p) { // Constructor with 3 arguments
		super(name);
		this.quantity=q;
		this.price=p;
		
		System.out.println(getname());
		Prices AppleTP = new AppleTotalPrice();
		Prices DragonFruitTP = new DragonFruitTotalPrice();
		Prices WatermelonTP = new WatermelonTotalPrice();
		
		if (quantity<10) {
			System.out.println("Quantity of "+ name +"is less than 10");
		}
			else if (quantity >= 10 && quantity <=100) {
				if (name =="Apple"||name=="Red Apple"||name=="Green Apple") {
					System.out.println("Quantity of " + name + " is less than 10");
					System.out.println("Total Price is RM "+AppleTP.totalprice(q));
			}
				else if (name == "Dragon Fruit") {
					System.out.println("Quantity of " + name + " is less than 10");
						System.out.println("Total Price is RM "+DragonFruitTP.totalprice(q));
			}
				else if (name == "Watermelon")
					System.out.println("Quantity of " + name + " is less than 10");
						System.out.println("Total Price is RM "+WatermelonTP.totalprice(q));
			}
		
	
	
		else {
			if (name =="Apple"||name=="Red Apple"||name=="Green Apple") {
				
				Discount ad = new AppleDiscount();
				double ad1 = ad.discount();
				System.out.println("Quantity of " + name + " is more than 10");
					System.out.println("Total Price is RM "+AppleTP.totalprice(q, p));
		}
			else if (name == "Dragon Fruit") {
				Discount df = new DragonFruitDiscount();
				double df1 = df.discount();
				System.out.println("Quantity of " + name + " is more than 10");
						System.out.println("Total Price is RM "+DragonFruitTP.totalprice(q, p));
		}
			else if (name == "Watermelon") {
				Discount watermelon = new WatermelonDiscount();
				double wm1 = watermelon.discount();
				System.out.println("Quantity of " + name + " is more than 10");
					System.out.println("Total Price is RM "+WatermelonTP.totalprice(q, p));
			}
		}
	}

	public String printTips() {
		return"\nThe best time to eat fruits is in the morning.";
	}
	public String toString() {
		return printTips();
	}
	}
	
	
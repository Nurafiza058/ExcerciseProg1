package Excercise4;

public class Watermelon extends Fruit implements Discount {

	private static String name;
	private int weight;
	private double price;
	
	public Watermelon(String name, int q, double p) {
		super();
		this.weight = q;
		this.price = p;	

		if (this.weight < 10) {
			totalPrice();
			System.out.println(name);
			System.out.println("Weight = " + this.weight+"kg");
			System.out.println("Price = RM" + this.price);
			System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
		
		}
		else if (this.weight > 10 && this.weight < 100) {
			double more = 2.4; 
			totalPrice(more);
			System.out.println(name);
			System.out.println("Weight = " + this.weight+"kg");
			System.out.println("Price = RM" + more);
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(more));
		}
		else {
			double more = 2.2; 
			double discount = 5; 
			totalPrice(more, discount);
			System.out.println(name);
			System.out.println("Weight = " + this.weight+ "kg");
			System.out.println("Price = RM" + more);
			System.out.println("Discount = RM" + discount);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(more,discount));
			}
	}
		    
	public double totalPrice() {
		return this.price * this.weight;
	}
	public double totalPrice(double more) {
		return more * this.weight;
	}
	public double totalPrice(double more, double discount) {
		return (more * this.weight) - discount;
	}

	public String printWatermelon() {
		return "Our Watermelon is fresh!!!!";
	}
	
}



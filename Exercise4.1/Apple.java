package Exercise;

public class Apple extends Fruit{


	private int quantity;
	private double price;
	
	public Apple(String name, int q, double p) {
		super(name);
		this.quantity = q;
		this.price = p;
		
	}
	public int quantity() {
		return this.quantity;
	}
	public double price() {
		return this.price;
	}	
	public double buyApple() {
		return this.price*this.quantity;
	
}
	
	
}


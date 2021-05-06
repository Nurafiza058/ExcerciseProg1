package Excercise4;

public class Apple extends Fruit{
	
	private static String name;
	private int quantity;
	private double price,allrprice;
	
	
		public Apple(String name, int q, double p) {
			super(name);
			this.quantity = q;
			this.price = p;	
	
			if (this.quantity < 10) {
				totalPrice();
				System.out.println(name);
				System.out.println("Quantity = " + this.quantity);
				System.out.println("Price = RM" + this.price);
				System.out.println("If quantity LESS than 10, Total price: RM" + totalPrice());
			
			}
			else if (this.quantity > 10 && this.quantity < 100) {
				double more = 2.4; 
				totalPrice(more);
				System.out.println(name);
				System.out.println("Quantity = " + this.quantity);
				System.out.println("Price = RM" + more);
				System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(more));
			}
			else {
				double more = 2.2; 
				double discount = 5; 
				totalPrice(more, discount);
				System.out.println(name);
				System.out.println("Quantity = " + this.quantity);
				System.out.println("Price = RM" + more);
				System.out.println("Discount = RM" + discount);
				System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(more,discount));
				}
			}
			    
		public double totalPrice() {
			return this.price * this.quantity;
		}
		public double totalPrice(double more) {
			return more * this.quantity;
		}
		public double totalPrice(double more, double discount) {
			return (more * this.quantity) - discount;
		}

		public String  printApple() {
			return "Our Apple is fresh!!!!";
	}
}
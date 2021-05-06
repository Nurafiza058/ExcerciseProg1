package Excercise4;

public class GreenApple {

	private static String name;
	private String flavour;
	private int greenquantity;
	private double price;
	
	
		public GreenApple(String n,int gq, double p) {
			super();
			name =n;
			flavour="Sour";
			greenquantity=5;
			price = 10;
		}
		public int buyGreenApple(int gq) {
		return gq;
		}
		public double payment() {
			return greenquantity*price;
		}
		public String printGreenApple() {
			return "Our Green Apple is fresh!!!!";
		}
		public String toString() {
			return "\nName\t\t\t: " + name +
					"\nFlavour\t\t\t: " + flavour + 
					   "\nQuantity\t\t: " + greenquantity +
						"\nTotal Price\t\t: RM" + payment();
		}
		}



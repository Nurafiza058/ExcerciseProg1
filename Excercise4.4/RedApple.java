package Excercise4;

public class RedApple extends Apple{

	private static String name;
	private String flavour;
	private int redquantity;
	private double price;
	

		public RedApple(String n,int rq, double p) {
			super(n, rq, p);
			name =n;
			flavour="Sweet";
			redquantity=5;
			price = 10;

		}
		public double buyRedApple(double p) {
			return p;
		}
		public double payment() {
			return redquantity*price;
		}
		public String printRedApple() {
			return "Our Red Apple is fresh!!!!";
		}
		
		public String toString() {
			return "\nName\t\t\t: " + name +
					"\nFlavour\t\t\t: " + flavour + 
					   "\nQuantity\t\t: " + redquantity +
						"\nTotal Price\t\t: RM" + payment();
				}
}

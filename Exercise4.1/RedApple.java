package Exercise;

public class RedApple extends Apple{
	
	private String flavour;
	private int redquantity;
	private double price;
	
		public RedApple(String name,String f,int rq, double p) {
			super(name, rq, p);
			this.flavour=f;
			this.redquantity=rq;
			this.price = p;
		
			
		}
		public String flavour() {
			
			return this.flavour;
			
		}
		public int redquantity() {
			
			return this.redquantity;
		}

		public double price() {
			return this.price;
		}
}

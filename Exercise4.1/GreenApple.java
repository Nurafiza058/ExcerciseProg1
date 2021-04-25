package Exercise;

public class GreenApple extends Apple{
	

	private String flavour;
	private int greenquantity;
	private double price;

	public GreenApple(String name,String f,int gq , double p) {
		super(name, gq, p);
		this.flavour=f;
		this.greenquantity=gq;
		this.price = p;
	
		
	}
	public String flavour() {
	
		return this.flavour;
		
	}
	public int greenquantity() {
	
		return this.greenquantity;
	}
	public double price() {
		return this.price;
	}

}

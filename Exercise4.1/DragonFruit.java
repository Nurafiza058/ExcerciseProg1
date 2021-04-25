package Exercise;

public class DragonFruit extends Fruit{
	
	private double priceperkg, totalprice;

	public DragonFruit(String name, double pkg, double tp) {
		super(name);
		this.priceperkg = pkg;
		this.totalprice = tp;
		
	
		
	}
	public double priceperkg() {
		return this.priceperkg;
	}
	public double totalprice() {
		return this.totalprice;
	}
	
}
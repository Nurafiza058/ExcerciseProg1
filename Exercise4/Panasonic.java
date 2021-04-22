package Exercise4;

public class Panasonic extends Lamp{

	private	double discount,totalprice,adiscount;
	private int quantity,shipping;
		Panasonic(String b, String c, double p, int q,int sh){
			super(b,c,p,q,sh);
			quantity=q;
		}
		public int getquantity() {
			return this.quantity;
		}
		public int getshipping() {
			return this.shipping;
		}
		public double gettotalprice() {
			totalprice = super.getprice()*quantity;
			return this.totalprice;
		}
		public double getdiscount(){
			discount= (totalprice*0.2);
			return this.discount;	
		}
		public double getafterdiscount(){
			adiscount= ((gettotalprice()-getdiscount())+getshipping());
			return this.adiscount;
		}
		public String toString() {
	        return "\nPanasonic "+ super.toString()+"\n\nPrice\t:RM "+ gettotalprice()
	        + "\nQuantity: "+ quantity; 
	
	
	}
	
}



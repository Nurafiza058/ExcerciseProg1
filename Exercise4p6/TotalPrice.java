package Exercise4p6;

 class AppleTotalPrice implements Prices{
	
	double apple1= 2;
	double apple2 = 0.5;
	

	public double totalprice(double qq) {
		return apple1*qq;
	}

	public double totalprice(double qq, double dd) {
		return (apple2*qq)*(1-dd);
	}
}
	
	
	class DragonFruitTotalPrice implements Prices{
		double dragonfruit1 = 5;
		double dragonfruit2 = 3;
	
		public double totalprice(double qq) {
			return dragonfruit1*qq;
		}


		@Override
		public double totalprice(double qq, double dd) {
			// TODO Auto-generated method stub
			return (dragonfruit2*qq)*(1-dd);
		}
	}
	
	
	class WatermelonTotalPrice implements Prices{
		double watermelon1 = 20;
		double watermelon2 = 15;
		


		public double totalprice(double qq) {
		
			return watermelon1*qq;
		}


		public double totalprice(double qq, double dd) {
		
			return (watermelon2*qq)*(1-dd);
		}
	}
	

	


package FanSetterGetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Fan k = new Fan();
			
			k.setBrand("KDK");
			k.settypeofFan("Table Fans");
			k.setmodel("KB-404");
			k.setColor("FLAME RED");
			k.setcapacity(2225);
			k.setmotorType(0.08);
			k.setWeight(4.30);
		
			
			System.out.println("Brand \t\t:" + k.getBrand());
			System.out.println("Type of fan \t:"+ k.gettypeofFan());
			System.out.println("Model \t\t:" + k.getmodel());
			System.out.println("Color \t\t:"+ k.getColor());
			System.out.println("Capacity \t:" +k.getcapacity());
			System.out.println("Motor Type \t:" +k.getmotorType());
			System.out.println("Weight \t\t:"+ k.getWeight());
			
			

		}

	
	

	}


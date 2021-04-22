package Exercise4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lamp objlamp = new Lamp();
		Panasonic objpanasonic= new Panasonic("Panasonic","White",50,3,10);
		
		System.out.println(objlamp);
	
		System.out.println(objpanasonic);
		System.out.println("\nTotal Price\t\t:RM "+objpanasonic.gettotalprice());
		System.out.println("Price after discount\t:RM "+objpanasonic.getafterdiscount());
	
	
		

	}

}

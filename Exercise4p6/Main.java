package Exercise4p6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("**************************************************************");
		Apple a = new Apple("Apple", 10, 2);
		System.out.println(a);
		System.out.println();
		
		RedApple b = new RedApple("Red Apple", 100, 1.0, "Sour", "From Japan");
		System.out.println("Taste of the apple is "+b.flavour());
		System.out.println("Imported"+b.imported());
		
		System.out.println();
		
		GreenApple c = new GreenApple("Green Apple", 15, 2, "Sour", "From Australia");
		System.out.println("Taste of the apple is "+c.flavour());
		System.out.println("Imported "+c.imported());
		
		System.out.println();
		
		DragonFruit d = new DragonFruit("Dragonfruit", 20, 5, "White", "From Thailand", 350);
		
		System.out.println("Colour : "+d.colour());
		System.out.println("weight : "+d.weight());
		System.out.println("Imported "+d.imported());
		
		System.out.println();
		
		Watermelon e = new Watermelon("Watermelon", 2, 20,'N',30);
		System.out.println("Does it have seeds :"+e.seeds());
		System.out.println("Calories : "+e.calories());
		
		System.out.println("**************************************************************");
	}

}

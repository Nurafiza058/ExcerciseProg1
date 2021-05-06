package Excercise4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Apple b = new Apple("Apple", 25, 6);
		System.out.println(b);
		System.out.println(b.printApple());
	
		System.out.println();
		
		RedApple c = new RedApple("Red Apple",1, 2);
		System.out.println(c.printRedApple());
		
		System.out.println();
		
		GreenApple d = new GreenApple("Green Apple", 1, 2.5);
		System.out.println(d);
		System.out.println(d.printGreenApple());
		
		System.out.println();
		
		DragonFruit e = new DragonFruit("Dragon Fruit",7, 2);
		System.out.println(e);
		System.out.println(e.printDragonFruit());
		
		System.out.println();
		
		Watermelon f = new Watermelon("Watermelon",20,5);
		System.out.println(f.printWatermelon());
		

	

		


}

}
package Excercise2;

public class main {

	public static void main(String[] args) {

		Panda a = new Panda();
		System.out.println("Have claws = " + a.haveclaws);
		System.out.println("Trophic Level = " + a.trophiclevel);
		System.out.println("Type of animal = " + a.typeofanimal);
		System.out.println("Weight = " + a.weight +" kg");
		System.out.println();
		a.eat();
		a.play();
		a.hunt();
		a.walk();
		
		System.out.println();
		
		PolarBear b = new PolarBear();
		System.out.println("Have claws = " + b.haveclaws);
		System.out.println("Trophic Level = " + b.trophiclevel);
		System.out.println("Type of animal = " + b.typeofanimal);
		System.out.println("Weight = " + b.weight +" kg");
		System.out.println();
		b.eat();
		b.play();
		b.hunt();
		b.walk();
	}

}
package Exercise21;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bear Polarbear = new Bear();
		Bear Panda = new Bear();
		
		Polarbear.name = "Polar Bear / Ursus maritimus";
		Polarbear.haveclaws = "Yes";
		Polarbear.trophiclevel ="Carnivorous";
		Polarbear.typeofanimal = "Mammals";
		Polarbear.weight ="150 – 250";
		
		Panda.name= "Panda / Ailuropoda melanoleuca ";
		Panda.haveclaws ="Yes";
		Panda.trophiclevel= "Herbivorous";
		Panda.typeofanimal= "Mammals";
		Panda.weight= "70 - 100";
		
		System.out.println();
		
		System.out.println("Name = " + Polarbear.name);
		System.out.println("Have claws = " + Polarbear.haveclaws );
		System.out.println("Trophic Level = " + Polarbear.trophiclevel );
		System.out.println("Type of animal = " + Polarbear.typeofanimal );
		System.out.println("Weight = " + Polarbear.weight +" kg");
		
		System.out.println();
		
		Polarbear.eat();
		Polarbear.play();
		Polarbear.hunt();
		Polarbear.walk();
		
		System.out.println();
		
		System.out.println("Name = " + Panda.name);
		System.out.println("Have claws = " + Panda.haveclaws);
		System.out.println("Trophic Level = " + Panda.trophiclevel);
		System.out.println("Type of animal = " + Panda.typeofanimal );
		System.out.println("Weight = " + Panda.weight +" kg");
		
		System.out.println();
		
		Panda.eat();
		Panda.play();
		Panda.hunt();
		Panda.walk();
		
	}

}

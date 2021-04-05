package Exercise22;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bear polarbear = new Bear();
		Bear panda = new Bear();
		Bear sunbear = new Bear();
		Bear grizzlybear = new Bear();
		Bear slothbear = new Bear();
		
		
		System.out.println("Polar Bear");
		polarbear.printSpec("Artic Sea Ice","White","Carnivore","Mammal",450, 130.0,31000,'Y');
		
		System.out.println("Giant Panda");
		panda.printSpec("Temperate Forests","Black and White","Herbivorous","Mammal",160,0.9,633,'Y');
		
		System.out.println("Sun Bear");
		sunbear.printSpec("Tropical Forests","Black and orange","Omnivorous","Mammal",70,1.52,500,'Y');
		
		System.out.println("Grizzly Bear");
		grizzlybear.printSpec("Riparian Area","Dark Brown","Omnivorous","Mammal",270,2.43,88000,'N');
		
		System.out.println("Sloth Bear");
		slothbear.printSpec("Forest","Dusty Black","Carnivore","Mammal",136,2.0,20000,'Y');
		
		
}

}

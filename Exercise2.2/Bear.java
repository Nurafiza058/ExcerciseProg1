package Exercise22;

public class Bear {
	

	String habitat;
	int weight;
	double tall;
	String color;
	char endangered;
	String trophiclevel; 
	String typeofanimal;
	int population;
	
	void printSpec (String h,String c, String tl, String toa, int w,double t,int p,char ed) {
		
		System.out.println();
		System.out.println("Habitat : "+ h);
		System.out.println("Color :" + c);
		System.out.println("Trophic Level :" + tl);
		System.out.println("Type of animal :" + toa);
		System.out.println("Weight :"+ w +" Kg");
		System.out.println("Height : "+ t + " meter");
		System.out.println("Population :" + p);
		System.out.println("Endangered :" + ed);
		
		System.out.println();
		
		
		calBMI(t,w);
		populate(p);
		tall (t);
		System.out.println("***********************************************************************");		
	}
	
	double calBMI(double t, int w) {
		double total = w / (t*t);
		System.out.println("BMI :" + total);
		return total;
		
	} 
	void populate (int p) {
		System.out.println("Based on 2020 suervey the bear only left " + p + " in this world.");
		
	}
	void tall (double t) {
		System.out.println("If the bear is standing the height is " + t + "meters");
	}

		
		
		
	
	}




import java.util.Scanner;
public class Excercise {
 
	public static void main(String[] args) {
		
		String[] arra = new String[5];

		int dec_num, quot, i=2, j;
	    int bin_num[] = new int[200];
	    Scanner scan = new Scanner(System.in);
			
	    System.out.print("Input a Decimal Number : ");
	    dec_num = scan.nextInt();
			
	    quot = dec_num;
			
	    while(quot != 0)
	    {
	      bin_num[i++] = quot%2;
	            quot = quot/2;
	    }
			
	    System.out.print("Binary number is: ");
	    for(j=i-1; j>0; j--)
	    {
	    System.out.print(bin_num[j]);
	    }
	    System.out.print("\n");
			
  
			change2C();
			change3C();
			change4C();
			change5C();
			change6C();
			change7C();
			change8C();
			change9C();
 }
 
 	static void change2C() {
 		Scanner input = new Scanner(System.in);
 	
 	 	double width = 8.2;
 	 	double height = 12.0;

 	 	double perimeter = 2*(height + width);
		
 	 	double area = width * height;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

		System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

}
 	static void change3C() {
 		Scanner io = new Scanner(System.in);
 		
 		System.out.println("Input the radius of the circle: ");
 		  
 		double radius = io.nextDouble();
 		  
 		System.out.println("Perimeter is = " + (2 * radius * Math.PI));
 		  
 		System.out.println("Area is = " + (Math.PI * radius * radius));
 	}
 	static void change4C() {
 		
 		Scanner in = new Scanner(System.in);
 	   
		System.out.print("Input first number: ");
		int num1 = in.nextInt();

		System.out.print("Input second number: ");
		int num2 = in.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + 
		(num1 + num2));

		System.out.println(num1 + " - " + num2 + " = " + 
		(num1 - num2));

		System.out.println(num1 + " x " + num2 + " = " + 
			(num1 * num2));

		System.out.println(num1 + " / " + num2 + " = " + 
		(num1 / num2));

		System.out.println(num1 + " mod " + num2 + " = " + 
		(num1 % num2));
 	}
 	static void change5C() {
 		 Scanner in = new Scanner(System.in);
 		 
 		  int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
 		  long octal_num, tempoctal_num, binary_num, place;
 		  int rem;
 		  System.out.print("Input any octal number: ");
 		  octal_num = in.nextLong();
 		  tempoctal_num = octal_num;
 		  binary_num = 0;
 		  place = 1;
 		  while (tempoctal_num != 0)
 		  {
 		   rem = (int)(tempoctal_num % 10);
 		   binary_num = octal_numvalues[rem] * place + binary_num;
 		   tempoctal_num /= 10;
 		   place *= 1000;
 		  }
 		  System.out.print("Equivalent binary number: " + binary_num+"\n");
 		  
}
 	static void change6C() {
 		 Scanner in = new Scanner(System.in);
         System.out.print("Input the length of a side of the hexagon: ");
         double s = in.nextDouble();
         System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
     }
     public static double hexagonArea(double s) {
         return (6*(s*s))/(4*Math.tan(Math.PI/6));
 	}
 	static void change7C() {
 		 Scanner sc = new Scanner(System.in);
         System.out.print("Input a string: ");
         char[] letters = sc.nextLine().toCharArray();
         System.out.print("Reverse string: ");
         for (int i = letters.length - 1; i >= 0; i--) {
             System.out.print(letters[i]);
         }
         System.out.print("\n");
     }
 	static void change8C() {
 		Scanner in = new Scanner(System.in);
 		System.out.print("Input the number of sides on the polygon: ");
        int ns = in.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = in.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side)+"\n");
    }
    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
 	
 	}
    static void change9C() {
    	 Scanner in = new Scanner(System.in);
    	 
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
 		System.out.print("Input the second number: ");
 		int y = in.nextInt(); 
 		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test(x, y, z,true));
 		System.out.print("\n");
     }
     
     public static boolean test(int p, int q, int r, boolean xyz)
      {
 	   if(xyz)
 		  return (r > q);
 	   return (q > p && r > q);
    }
}
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
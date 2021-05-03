package Excercise4;

public class Fruit {
	
	protected String name;
	
	public Fruit() { //constructor no argument 
		name="";
	}
	
	public Fruit (String n) { //constructor 1 argument
		name=n;
		
	}
	public String getname() {
		return name;
	}
	public String toString() { //overriding
		return name + " constructor is invoked";
	}
}

package Excercise4;

public class Fruit {
	
	protected String name;
	
	public Fruit() {
		name="";
	}
	
	public Fruit (String n) { 
		name=n;
		
	}
	public String getname() {
		return name;
	}
	public String toString() { 
		return name + " constructor is invoked";
	}
}

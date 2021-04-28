package Exercise;

public class Fruit {

	private String name;
	
	public Fruit() {
	this.name="";
	
	System.out.println( name +" constructur is invoked");
	}
	public Fruit(String name) { 
		this.name = name;
		System.out.println(name + " constructor is invoked.");
	}

	public String toString() {
		return "Name\t\t: " + name;
	}
}


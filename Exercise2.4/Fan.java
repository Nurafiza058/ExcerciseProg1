package FanSetterGetter;

public class Fan {


		String brand;
		String typeofFan;
		String model;
		String color;
		int capacity;
		double motorType;
		double weight;
		
		
		  
		 // Setter Method
		  public void setBrand(String brand) {
		    this.brand = brand;
		  }
		  public void settypeofFan(String typeofFan) {
			    this.typeofFan = typeofFan;
		  }
		  public void setmodel(String model) {
				this.model = model;
		  }
		  
		  public void setColor(String color) {
			    this.color = color;
		  }
		  
		  public void setcapacity(int capacity) {
		    this.capacity = capacity;
		  }

		  public void setmotorType(double motorType) {
			  this.motorType = motorType;
		  }
		  public void setWeight(double weight) {
			  this.weight = weight;
		  }
		  
		  
		  // Getter Method
		
		  public String getBrand() {
			  return this.brand;
		  }
		  public String gettypeofFan() {
		 	  return this.typeofFan;
	 	  }
		  public String getmodel() {
		 	  return this.model;
	 	  }
		  public String getColor() {
		 	  return this.color;
	 	  }
		  public double getcapacity() {
			  return this.capacity;
		  }
		  public double getmotorType() {
			  return this.motorType;
		  }
		  public double getWeight() {
			  return this.weight;
		  }
		  
		
		}
	


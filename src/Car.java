public class Car {

	private  String Color;
	private int hPower;
	private String engine;
	
	public Car(){
		this.Color = "N/A";
		this.hPower = 0;
		this.engine = "N/A";
	}
	
	public Car(String Color, int HP, String engine){
		this.Color = Color;
		this.hPower = HP;
		this.engine = engine;
	}
	
	public String getColor(){
		return this.Color;
	}
	
	public int getHP(){
		return this.hPower;
	}
	
	public String getEngine(){ 
		return this.engine;
	}
	public void setColor(String Color){
		this.Color = Color;
	}
	
	public void setHP(int HP){
		this.hPower = HP;
	}
	
	public void setEngine(String engine){ 
		this.engine = engine;
	}
	public String toString(){
		return "Color: " + this.Color + ", Horse Power: " + this.hPower + ", Engine: " + this.engine; 
	}
}



//Class Exercise:
//
//Create a Car Class with color, horse power, engine size, and make as instance variable
//
//Including getter and setter methods, toString, constructor with no parameter and with 
//parameters (all local varibles that matching instance variables)
//
//Create another class named CarDriver that instantiate three car objects from Car 
//class and call all the methods from car class.

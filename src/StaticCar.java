public class StaticCar {

	private  String Color;
	private int hPower;
	private String engine;
	public static int CarCount;
	public StaticCar(){
		this.Color = "N/A";
		this.hPower = 0;
		this.engine = "N/A";
	}
	
	public StaticCar(String Color, int HP, String engine){
		this.Color = Color;
		this.hPower = HP;
		this.engine = engine;
		this.CarCount++;
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
	public static int getCount(){
		return CarCount;
	}
	public boolean equals(StaticCar otherObject){
		return (this.Color.equals(otherObject.Color) && this.hPower == otherObject.hPower && this.engine.equals(otherObject.engine));
	}
	}

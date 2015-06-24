
public class Cycle {
	private int numberOfWheels;
	private int weight;
	
	public Cycle(){
		Cycle cycle = new Cycle(100,1000);
		this.numberOfWheels = cycle.numberOfWheels;
		this.weight = cycle.weight;
	}
	public Cycle(int numberOfWheels, int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}
	
	
	public String toString(){
		return "The number of wheels is: "
				+ numberOfWheels
				+ "\nThe weight is " + weight;
	}

	
}

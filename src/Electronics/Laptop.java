
public class Laptop extends BasicElectronics {
public String processor;
public double batteryLife;
public String Resolution;
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public double getBatteryLife() {
	return batteryLife;
}
public void setBatteryLife(double batteryLife) {
	this.batteryLife = batteryLife;
}
public String getResolution() {
	return Resolution;
}
public void setResolution(String resolution) {
	Resolution = resolution;
}
public Laptop(String brand, double watts, double cost, String name,
		String processor, double batteryLife, String resolution) {
	super(brand, watts, cost, name);
	this.processor = processor;
	this.batteryLife = batteryLife;
	Resolution = resolution;
}
@Override
public String toString() {
	return "Laptop [processor=" + processor + ", batteryLife=" + batteryLife
			+ ", Resolution=" + Resolution + ", Brand=" + Brand + ", watts="
			+ watts + ", cost=" + cost + ", name=" + name + "]";
}

}


public class BasicElectronics {
public String Brand;
public double watts;
public double cost;
public String name;
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public double getWatts() {
	return watts;
}
public void setWatts(double watts) {
	this.watts = watts;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public BasicElectronics(String brand, double watts, double cost, String name) {
	super();
	Brand = brand;
	this.watts = watts;
	this.cost = cost;
	this.name = name;
}

}

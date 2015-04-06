
public class CarDriver {

	public static void main(String[] args) {
		Car haseebCar = new Car("Blue", 240, "V8");
		System.out.println(haseebCar);
		Car tanesCar = new Car();
		System.out.println(tanesCar);
		Car bobsCar = new Car("Orange", 100, "V3.5");
		System.out.println(bobsCar);
		
		System.out.println(haseebCar.getColor() + " " +
				haseebCar.getEngine() + " " +
				haseebCar.getHP());
		
		tanesCar.setHP(460);
		tanesCar.setColor("Mustang Red");
		tanesCar.setEngine("V8");
		System.out.println(tanesCar);
	}

}

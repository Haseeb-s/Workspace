
public class ElectronicsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop("Apple", 12.0, 1500, "Macbook Pro", "I5", 12, "1080x987");
		System.out.println(laptop);
		Desktop Powerhouse = new Desktop("Custom", 750, 1600, "Gaming PC", "i7", "GTX 970", "Corsair", "Fractal R4", "Asrock");
		System.out.println();
		System.out.println(Powerhouse);
	}

}

import javax.swing.*;
public class StaticCarDriver {

	public static void main(String[] args) {
		String color = "blue", engine = "v6";
		int hpower = 120;
		StaticCar haseebCar = new StaticCar("blue", 698, "v20");
		StaticCar testCar = new StaticCar("Orange", 420, "V2.3");
		StaticCar tanesCar, bobsCar;
		for(int x=1; x<4; x++)
		{
			JOptionPane.showInputDialog(null, "Input the (String)color for car # " + x + ": ");
			JOptionPane.showInputDialog(null, "Input the (String)engine for car # " + x + ": ");
			JOptionPane.showInputDialog(null, "Input the (int)hpower for car # " + x + ": ");
			
			if (x == 1){
				haseebCar = new StaticCar(color, hpower, engine);
				testCar = new StaticCar(color, hpower, engine);
			}
			if (x ==2){
				tanesCar = new StaticCar(color, hpower, engine);
			}
			else{
				bobsCar = new StaticCar(color, hpower, engine);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Results of first car compared to duplicate.. \n " + haseebCar.equals(testCar) );
	}

}

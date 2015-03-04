import javax.swing.*;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int groupSize;
		int teamSize;
		String numPeople =JOptionPane.showInputDialog("Insert number of people: ");
		String numPlayers = JOptionPane.showInputDialog("Insert number of players: ");
		
		int numPeeps = Integer.parseInt(numPlayers);
		int numPlay = Integer.parseInt(numPlayers);
		
		
		if (numPeeps > 3 && numPeeps < 10){
			groupSize = numPeeps/3;
		}
		if(numPeeps > 10){
			groupSize = numPeeps/2;
			
		}
		else
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
			
			
			
		if(numPlay < 55 && numPlay > 11){
			teamSize = numPlay/11;
		}
		else{
			teamSize = 1;
		}
	}

}

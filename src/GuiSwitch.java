import javax.swing.*;
public class GuiSwitch {
	
	public enum AccountType {
        January, February, March, April, May, June, July, August, September, October, November, December
 }

 public static void main(String[] args) {
        AccountType[] choices = { AccountType.January,
                     AccountType.February, AccountType.March, AccountType.April, AccountType.May, AccountType.June, AccountType.July,
                     AccountType.August, AccountType.September, AccountType.October, AccountType.November, AccountType.December};
        
        boolean continueLoop = true;
        
        do{
        	
        AccountType decision = (AccountType)JOptionPane.showInputDialog(
                null, "Select your account type.", "Account Type",
                JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
        System.out.println(decision);
        
       switch(decision){
       
       case January:
       		JOptionPane.showMessageDialog(null, "Do you want to build a snowman?!");
       		break;
       case February:
    	   JOptionPane.showMessageDialog(null, "Do you want to build a snowman?!");
    	   break;
       case March:
    	   JOptionPane.showMessageDialog(null, "Happy Spring Days!");
    	   break;
       case April:
    	   JOptionPane.showMessageDialog(null, "Happy Spring Days!");
    	   break;
       case May:
    	   JOptionPane.showMessageDialog(null, "Happy Spring Days!");
    	   break;
       case June:
    	   JOptionPane.showMessageDialog(null, "It's summer time.");
    	   break;
       case July:
    	   JOptionPane.showMessageDialog(null, "It's summer time.");
    	   break;
       case August:
    	   JOptionPane.showMessageDialog(null, "It's summer time.");
    	   break;
       case September:
    	   JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
    	   break;
       case October:
    	   JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
    	   break;
       case November:
    	   JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
    	   break;
       case December:
    	   JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
    	   break;
       }

        }while(continueLoop == true);
 }
}
 

import javax.swing.*;
public class Assignment3 {
	static String[] AccountName = {"Jake","Tanes","Haseeb"};
	static String[] AccountPass = {"password1","helloworld","ayylmao"};
	static String[] AccountType = {"Admin","Staff","Student"};
	static boolean correctInfo = false;
	static boolean correctType = false;
	public static String userT;
	public static void main(String args[]){
		
	
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		Object[] fields = {
				"Username:", field1,
				"Password:", field2,
		};
		
		for (int incorrectTries = 0; correctInfo == false; incorrectTries++){

		
			JOptionPane.showConfirmDialog(null, fields, "Assignment3", JOptionPane.OK_CANCEL_OPTION);
			 
			for (int timer = 0; timer < 3; timer++){
	
					if (field1.getText().equals((String)AccountName[timer]) && field2.getText().equals((String)AccountPass[timer]) ){
						correctInfo = true;
					}
			}

		if (incorrectTries == 2){
			JOptionPane.showMessageDialog(null, "Contact Admin.");
			break;
		}
	}
	
		if(correctInfo == true)
		{
			do{
				userT = (String)JOptionPane.showInputDialog(null, "Please select your account type", "Account Type",
						JOptionPane.INFORMATION_MESSAGE, null, AccountType , AccountType[0]  );
				
				for (int timer = 0; timer < 3; timer++){
				if (field1.getText().equals((String)AccountName[timer]) && field2.getText().equals((String)AccountPass[timer]) 
						&& userT.equals((String)AccountType[timer])){
						 correctType = true;}}
				
				if(correctType == true){
					
			switch(userT){
				case "Admin":
				JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
				break;
				
				case "Staff":
				JOptionPane.showMessageDialog(null, "Welcome Staff! You can only read file.");
				break;
				
				case "Student":
				JOptionPane.showMessageDialog(null, "Welcome Student! You can update, delete, and read file.");
				break;
			}
			}
		}while(correctType != true);
}
}
}
				
			
			
			
	
	


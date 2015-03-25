import javax.swing.*;
public class Assignment3 {
	//Creating variables used throughout the program
	static String[] AccountName = {"Jake","Tanes","Haseeb"};
	static String[] AccountPass = {"password1","helloworld","ayylmao"};
	static String[] AccountType = {"Admin","Staff","Student"};
	// checkers to see if the information put in is correct
	static boolean correctInfo = false;
	static boolean correctType = false;
	public static String userT;
	public static void main(String args[]){
		
	//creating object field1&2 called JTextField.. this will be used to hold the values put in by the user
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		Object[] fields = {
				"Username:", field1,
				"Password:", field2,
		};
		
		for (int incorrectTries = 0; correctInfo == false; incorrectTries++){

			//Asks user for info and saves it to the respective jtextfield. Includes okay and cancel button
			JOptionPane.showConfirmDialog(null, fields, "Assignment3", JOptionPane.OK_CANCEL_OPTION);
			 //looping to check if user info is correct
			for (int timer = 0; timer < 3; timer++){
	
					if (field1.getText().equals((String)AccountName[timer]) && field2.getText().equals((String)AccountPass[timer]) ){
						correctInfo = true;
					}
			}
		//checking the tries by the user. set to 2 because initlaized as 0
		if (incorrectTries == 2){
			JOptionPane.showMessageDialog(null, "Contact Admin.");
			break;
		}
	}
		//if the information is true, we can continue
		if(correctInfo == true)
		{	//do loop to run by one time min, while later to check if the user type was correct
			do{	//saving user input for the type
			
				userT = (String)JOptionPane.showInputDialog(null, "Please select your account type", "Account Type",
						JOptionPane.INFORMATION_MESSAGE, null, AccountType , AccountType[0]  );
				//re-used the previous loop to check if ALL the information matches. The arrays indexs for the same number hold the
				//correct information for that user+pass+type combo
				for (int timer = 0; timer < 3; timer++){
				if (field1.getText().equals((String)AccountName[timer]) && field2.getText().equals((String)AccountPass[timer]) 
						&& userT.equals((String)AccountType[timer])){
						 correctType = true;}}
				
				if(correctType == true){
				// simple switch, based on which usertype that the account is.	
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
		}while(correctType != true); //looping until the correctType is finally picked
}
}
}
				
			
			
			
	
	


	/**
	* @author Haseeb Shuaib
	* 2/25/2015
	*/
		import java.util.*;
		public class Authenticator{
			/**
			* <b>State Variables:</b>
			* <ul>
			*	<li> Scanner keyboard</li>
			*	<li> String username (which equals <b>whatever</b>)</li>
			*	<li> String password (which equals <b>password</b>)</li>
			* </ul>
			*/
			private static Scanner keyboard = new Scanner(System.in);
			private static String username = "whatever";
			private static String password = "password";

			public static void main(String[] args){
				/**
				* Strings <i>user</i> and <i>pwd</i> are used to store the 
				* user's input of user and password.
				* <br>
				* <b>Next Step:</b> Gather user input.
				*/
				String user;
				String pwd;

				System.out.println("Welcome, please enter username:");
				user = keyboard.next();

				System.out.println("Enter password for " + user + ":");
				pwd = keyboard.next();
				
				int incorect = 3;
				for (int incorrectPass = 0; incorrectPass < 3; incorrectPass++){
				/**
				* <i>After</i> user input is recorded, authenticate.
				* Use the <i>.equals()</i> String method to compare the username and password.
				* Use only one & to stop comparing if first condition is false.
				*/
				System.out.println("Enter the username: ");
				String username = keyboard.next();
				
				System.out.println("Enter the password: ");
				String pass = keyboard.next();
				
				if(username.equals(user) && pass.equals(pwd)){
					System.out.println("Welcome " + user + "!");
					break;
				}
				
				else
					System.out.println("Wrong Username or Password!");
					System.out.println("Incorrect. You have " + (--incorect) + " tries left.");
				
				}
			}
		}
		

	



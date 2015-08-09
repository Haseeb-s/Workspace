import java.util.*;
import java.io.*;
import java.lang.*;


public class Methods {
    Database Methods = new Database();

    //Parameters : PhoneContacts[] This array holds the information stored in the file
    //return type: void
    //Precondition: must be called
    //Postcondition: contents of the file are outputted

    public void viewContacts(String PhoneContacts[]) throws IOException {

        for (int maxIndex = 0; maxIndex < ArrayMethods.arraySize(); maxIndex++)// times looped is equal to the number of lines in the file
        {
            if (PhoneContacts[maxIndex].equals("NAME")) //outprints the first and last name that would ALWAYS follow "NAME":
            {
                System.out.println("Name: " + PhoneContacts[++maxIndex] + " " + PhoneContacts[++maxIndex]);

            } else if (PhoneContacts[maxIndex].equals("PHONE"))//outprints the phonenumber that would ALWAYS follow "PHONE":
            {
                System.out.println("Phone: " + PhoneContacts[++maxIndex]);
            } else if (PhoneContacts[maxIndex].equals("ADDRESS"))//outprints the address that would ALWAYS follow "ADDRESS":
            {
                System.out.println("Address: " + PhoneContacts[++maxIndex]);
            } else if (PhoneContacts[maxIndex].equals("NOTES"))//outprints notes that would ALWAYS follow "NOTES":
            {
                System.out.println("Notes: " + PhoneContacts[++maxIndex]);
                System.out.println("");
            }

        }
        System.out.println("What would you like to do next?");
    }


    //Parameters : PhoneContacts[] This array holds the information stored in the file
    //return type: void
    //Precondition: must be called
    //Postcondition:a new contact is added to the file
    public void addContact(String PhoneContacts[]) throws IOException {
        String contact[] = new String[ArrayMethods.arraySize()];//creating a array the size of the file
        int maxIndex = -1;
        Scanner scanner = new Scanner(new File("Phonebook.txt"));


        while (scanner.hasNext()) // runs the the file and saves each line to a new index of contact[maxIndex]
        {
            maxIndex++;
            contact[maxIndex] = scanner.nextLine();
        }
        int contactNumber = ArrayMethods.arraySize();
        String userInput, firstName, lastName;
        Scanner input = new Scanner(System.in); // allows scanner to get input from the keybaord
        FileWriter fw = new FileWriter("Phonebook.txt", true); //opens file and allows writing to the end of it
        PrintWriter output = new PrintWriter(fw);//allows output to file
        //outprinting the new contact to the end of the file
        output.println("NAME");
        System.out.println("Enter first name: ");
        firstName = input.nextLine();
        output.println(firstName);

        System.out.println("Enter last name: ");
        lastName = input.nextLine();
        output.println(lastName);

        output.println("PHONE");
        System.out.println("Enter phone number: ");
        userInput = input.nextLine();
        output.println(userInput);

        output.println("ADDRESS");
        System.out.println("Enter address: ");
        userInput = input.nextLine();
        output.println(userInput);

        output.println("NOTES");
        System.out.println("Enter notes: ");
        userInput = input.nextLine();
        output.println(userInput);

        output.close();
        fw.close();
        System.out.println(firstName + " " + lastName + " has been successfully added!");


    }


    //Parameters : PhoneContacts[] This array holds the information stored in the file
    //return type: void
    //Precondition: must be called
    //Postcondition:specified contact will no longer be included in the file and array

    public void deleteContact(String PhoneContacts[], String searchInput) throws IOException {
        String contact[] = new String[ArrayMethods.arraySize()];
        int maxIndex = -1;
        Scanner scanner = new Scanner(new File("Phonebook.txt"));


        while (scanner.hasNext()) {
            maxIndex++;
            contact[maxIndex] = scanner.nextLine();
        }

        String searchName = searchInput.toLowerCase();

        FileWriter fw = new FileWriter("PhoneBook.txt");
        PrintWriter output = new PrintWriter(fw);

        for (maxIndex = 0; maxIndex < contact.length; maxIndex++) {
            if (PhoneContacts[maxIndex].equals("NAME")) {
                String checkContact = PhoneContacts[++maxIndex].toLowerCase() + " " + PhoneContacts[++maxIndex].toLowerCase();
                maxIndex = maxIndex - 2;

                if (checkContact.equals(searchName)) {
                    maxIndex = maxIndex + 8;
                } else {
                    output.println(PhoneContacts[maxIndex]);
                }

            } else {
                output.println(PhoneContacts[maxIndex]);
            }

        }


        output.close();
        fw.close();
    }


    //Parameters : PhoneContacts[] This array holds the information stored in the file
    //return type: void
    //Precondition: must be called
    //Postcondition: the specified contact’s information will be outprinted

    public void searchContact(String PhoneContacts[]) throws IOException {
        int checkFinish = ArrayMethods.arraySize();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact's first or last name: ");
        String searchInput = input.nextLine(); //collects contacts first or last name from user
        String searchName = searchInput.toLowerCase();
        System.out.println("");

        for (int maxIndex = 0; maxIndex < ArrayMethods.arraySize(); maxIndex++) // searches for the first name of specified contact
        {
            String arrayName = PhoneContacts[maxIndex].toLowerCase();
            int checkIndex = maxIndex;
            if (arrayName.equals(searchName) && PhoneContacts[checkIndex - 1].equals("NAME")) {
                System.out.println("Name: " + PhoneContacts[maxIndex] + " " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Phone: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Address: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Notes: " + PhoneContacts[++maxIndex]);
                break;
            } else if (arrayName.equals(searchName) && PhoneContacts[checkIndex + 1].equals("PHONE")) //searches for the last name of specified contact
            {

                System.out.println("Name: " + PhoneContacts[--maxIndex] + " " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Phone: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Address: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Notes: " + PhoneContacts[++maxIndex]);
                break;
            }

            if (checkFinish == maxIndex + 1)  //error checking
                System.out.println("\nContact not found.\n");

        }
        System.out.println("What would you like to do next?");
    }

}

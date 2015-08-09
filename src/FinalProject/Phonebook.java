import java.util.*;
import java.io.*;
import java.lang.*;

public class Phonebook {

    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        Methods Methods = new Methods();
        ArrayMethods ArrayMethods = new ArrayMethods();
        String choice;
        int redo = 1;
        System.out.println("Welcome to your address book!");
        ArrayMethods.sortArray();

        do {
            System.out.println("");
            System.out.println("1. View contact list ");
            System.out.println("2. Add a new contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Edit a contact");
            System.out.println("5. Search for a contact");
            System.out.println("0. Quit");
            System.out.println("");
            System.out.println("");
            System.out.print("Please enter your choice: ");
            choice = input.nextLine();
            System.out.println("");
            ArrayMethods.sortArray();
            if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")) {


                switch (choice) {
                    case "1":
                        Methods.viewContacts(ArrayMethods.makeArray());
                        break;

                    case "2":
                        Methods.addContact(ArrayMethods.makeArray());
                        break;

                    case "3":
                        System.out.println("Enter contact's first and last name: ");
                        String searchInput = input.nextLine();
                        Methods.deleteContact(ArrayMethods.makeArray(), searchInput);
                        System.out.println("\nWhat would you like to do next?");
                        break;

                    case "4":

                        break;

                    case "5":
                        Methods.searchContact(ArrayMethods.makeArray());
                        break;
                }
            } else if (choice.equals("0")) {
                redo = 0;
            } else
                System.out.println("Please enter a number between 0-5.");

        }
        while (redo != 0);

        System.out.println("Goodbye!");

    }

}


class Database {

    public String[] makeArray() throws IOException {
        String contact[] = new String[arraySize()];
        int maxIndex = -1;
        Scanner scanner = new Scanner(new File("PhoneBook.txt"));
        Database phonebook = new Database();
        while (scanner.hasNext()) {
            maxIndex++;
            contact[maxIndex] = scanner.nextLine();
        }


        return contact;
    }


    public void viewContacts(String PhoneContacts[]) throws IOException {
        for (int maxIndex = 0; maxIndex < arraySize(); maxIndex++) {
            if (PhoneContacts[maxIndex].equals("NAME")) {
                System.out.println("Name: " + PhoneContacts[++maxIndex] + " " + PhoneContacts[++maxIndex]);

            } else if (PhoneContacts[maxIndex].equals("PHONE")) {
                System.out.println("Phone: " + PhoneContacts[++maxIndex]);
            } else if (PhoneContacts[maxIndex].equals("ADDRESS")) {
                System.out.println("Address: " + PhoneContacts[++maxIndex]);
            } else if (PhoneContacts[maxIndex].equals("NOTES")) {
                System.out.println("Notes: " + PhoneContacts[++maxIndex]);
                System.out.println("");
            }

        }
        System.out.println("What would you like to do next?");
    }


    public void addContact(String PhoneContacts[]) throws IOException {
        String contact[] = new String[arraySize()];
        int maxIndex = -1;
        Scanner scanner = new Scanner(new File("Phonebook.txt"));


        while (scanner.hasNext()) {
            maxIndex++;
            contact[maxIndex] = scanner.nextLine();
        }
        int contactNumber = arraySize();
        String userInput, firstName, lastName;
        Scanner input = new Scanner(System.in);
        FileWriter fw = new FileWriter("Phonebook.txt", true);
        PrintWriter output = new PrintWriter(fw);

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

        System.out.println("\nWhat would you like to do next?");

    }

    public void spaceFile(String PhoneContacts[]) throws IOException {
        String contact[] = new String[arraySize()];
        int maxIndex = -1;
        Scanner scanner = new Scanner(new File("Phonebook.txt"));


        while (scanner.hasNext()) {
            maxIndex++;
            contact[maxIndex] = scanner.nextLine();
        }

        FileWriter fw = new FileWriter("PhoneBook.txt");
        PrintWriter output = new PrintWriter(fw);

        for (maxIndex = 0; maxIndex < contact.length; maxIndex++) {
            output.println(PhoneContacts[maxIndex]);
        }


        output.close();
        fw.close();
    }

    public void deleteContact(String PhoneContacts[], String searchInput) throws IOException {
        String contact[] = new String[arraySize()];
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

    public void editContact() throws IOException {
        Database phonebook = new Database();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact's first and last name that you wish to edit: ");
        String searchInput = input.nextLine();
        phonebook.deleteContact(phonebook.makeArray(), searchInput);
        System.out.println("\nPlease enter the new contact's information.");
        phonebook.addContact(phonebook.makeArray());
    }

    public void searchContact(String PhoneContacts[]) throws IOException {
        int checkFinish = arraySize();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter contact's first or last name: ");
        String searchInput = input.nextLine();
        String searchName = searchInput.toLowerCase();
        System.out.println("");

        for (int maxIndex = 0; maxIndex < arraySize(); maxIndex++) {
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
            } else if (arrayName.equals(searchName) && PhoneContacts[checkIndex + 1].equals("PHONE")) {

                System.out.println("Name: " + PhoneContacts[--maxIndex] + " " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Phone: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Address: " + PhoneContacts[++maxIndex]);
                maxIndex++;
                System.out.println("Notes: " + PhoneContacts[++maxIndex]);
                break;
            }

            if (checkFinish == maxIndex + 1)
                System.out.println("\nContact not found.\n");

        }


        System.out.println("What would you like to do next?");
    }


    public static int arraySize() throws IOException {
        int x = 0;
        String fileName = "PhoneBook.txt";
        int linenumber = 0;
        BufferedReader file = new BufferedReader(new FileReader(fileName));

        if (file.ready()) {
            FileReader fr = new FileReader(fileName);
            LineNumberReader lnr = new LineNumberReader(fr); //LineNumberReader is used to find the total line number
            while (lnr.readLine() != null) {
                linenumber++;
            }
            lnr.close();
        }

        return linenumber;//Returns the size of the array
    }

    public static void sortArray() throws IOException {
        FileReader fzz = new FileReader("PhoneBook.txt");
        //	Scanner scanner = new Scanner(fzz);
        BufferedReader file = new BufferedReader(fzz);


        int phoneIndex = 0;
        String contactFName[] = new String[arraySize() / 9];
        String contactLName[] = new String[arraySize() / 9];
        String contactPhone[] = new String[arraySize() / 9];
        String contactAddress[] = new String[arraySize() / 9];
        String contactNote[] = new String[arraySize() / 9];
        int x = 0;
        for (int jj = 0; jj < contactFName.length; jj++) {
            file.readLine();
            contactFName[jj] = file.readLine();

            contactLName[jj] = file.readLine();
            file.readLine();
            contactPhone[jj] = file.readLine();
            file.readLine();
            contactAddress[jj] = file.readLine();
            file.readLine();
            contactNote[jj] = file.readLine();
            x++;
        }
    }
}

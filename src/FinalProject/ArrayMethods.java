
import java.util.*;
import java.io.*;
import java.lang.*;


public class ArrayMethods {

    //Parameters : NONE
    //return type: array
    //Precondition: must be called
    //Postcondition: makes an array containing whatever is in phonebook.txt

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


    //Parameters : NONE
    //return type: int
    //Precondition: must be called
    //Postcondition: returns the amount of lines found in phonebook.txt

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


    //Parameters : NONE
    //return type: void
    //Precondition: must be called
    //Postcondition: saves the file to an array. sorts that array then re writes the progblem
    public static void sortArray() throws IOException {
        FileReader fzz = new FileReader("PhoneBook.txt");
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


        String temp;

        for (int z = 1; z < contactLName.length; z++) {

            for (int y = 0; y < contactLName.length - z; y++) {
                if (contactLName[y].compareTo(contactLName[y + 1]) > 0)//sorts the array and saves it back into the array
                {
                    temp = contactFName[y];
                    contactFName[y] = contactFName[y + 1];
                    contactFName[y + 1] = temp;

                    temp = contactLName[y];
                    contactLName[y] = contactLName[y + 1];
                    contactLName[y + 1] = temp;

                    temp = contactPhone[y];
                    contactPhone[y] = contactPhone[y + 1];
                    contactPhone[y + 1] = temp;

                    temp = contactAddress[y];
                    contactAddress[y] = contactAddress[y + 1];
                    contactAddress[y + 1] = temp;

                    temp = contactNote[y];
                    contactNote[y] = contactNote[y + 1];
                    contactNote[y + 1] = temp;
                }
            }
        }


        FileWriter fw = new FileWriter("PhoneBook.txt"); //prints out the new sorted array
        PrintWriter output = new PrintWriter(fw);
        for (int finalOutput = 0; finalOutput < contactFName.length; finalOutput++) {

            output.println("NAME");
            output.println(contactFName[finalOutput]);
            output.println(contactLName[finalOutput]);
            output.println("PHONE");
            output.println(contactPhone[finalOutput]);
            output.println("ADDRESS");
            output.println(contactAddress[finalOutput]);
            output.println("NOTES");
            output.println(contactNote[finalOutput]);
        }


        file.close();
        output.close();
        fw.close();


    }


}

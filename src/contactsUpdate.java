
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class contactsUpdate {

    private static List<Contacts> ContactList = new ArrayList<>();

    public static int mainMenu() {

       System.out.println("\nMain menu options: ");
       System.out.println("enter one of the following number options");
       System.out.println(1+"." + " View contacts.");
       System.out.println(2+"." + " Add a new contact.");
       System.out.println(3+"." + " Search a contact by name");
       System.out.println(4+"." + " Delete an existing contact.");
       System.out.println(5+"." + " Exit.");

       Scanner userChoice = new Scanner(System.in);
       System.out.println("********************");
       int userInput = userChoice.nextInt();
       return userInput;
   };

   public static void addContact() throws IOException {
       Scanner userChoice = new Scanner(System.in);
       System.out.println("1. Add new contact ");
       System.out.println(" First name: ");
       String firstName = userChoice.nextLine();
       System.out.println(" Last Name: ");
       String lastName = userChoice.nextLine();
       System.out.println(" Phone Number: ");
       String phoneNumber = userChoice.nextLine();
       Files.write(
               Paths.get("Data", "contacts.txt"),
               Arrays.asList(firstName + " " + lastName + " | " + phoneNumber),
                       StandardOpenOption.APPEND);

             ContactList.add(new Contacts(firstName, lastName, phoneNumber));
       System.out.println(firstName + " " + lastName + " is successfully added to contact list." );
   }
// print out the list of contacts
    public static void printContactlist (){
        System.out.println("\nFirstname lastname | Phone Number ");
        Path contactsPaths = Paths.get("Data", "contacts.txt");
        List<String> ContactList = null;
        try {
            ContactList = Files.readAllLines(contactsPaths);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ContactList.size(); i++){
            System.out.println((i+0) + ": " + ContactList.get(i));
        }
    }

    //search contact by name
    public static void searchContact() {
    System.out.print(" Name: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedContact = myScanner.nextLine();
        Path ContactsPath = Paths.get("Data", "contacts.txt");
        List<String> ContactList;
        try {
            ContactList = Files.readAllLines(ContactsPath);
            for (String person : ContactList) {
                if (person.toLowerCase().contains(searchedContact.toLowerCase())) {
                    System.out.println("Contact:\n" + person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------");
        System.out.println("Redirecting to the Main Menu");
    }

    public static void deleteContact() {
        System.out.println("4. Delete contacts by name ");
        System.out.print(" Name: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedName = myScanner.nextLine();
        Path ContactsPath = Paths.get("Data", "contacts.txt");
        List<String> ContactList;
        try {
            ContactList  = Files.readAllLines(ContactsPath);
            List<String> newList = new ArrayList<>();
            for (String person :  ContactList ) {
                if (person.toLowerCase().contains(searchedName)) {
                    continue;
                }
                newList.add(person);
            }
            for (String name : newList) {
                System.out.println(name);
            }
            Files.write(Paths.get("Data", "contacts.txt"), newList); // overwrites old array list and replaces with new one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exit() {
        System.out.println("bye");
        System.exit(0);
    }
}

//test


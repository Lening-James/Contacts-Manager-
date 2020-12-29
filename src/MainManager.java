import java.io.IOException;

public class MainManager extends contactsUpdate {

    public interface Main {
         static void main(String args[]) throws IOException {


            while(true){
                int userChoice = contactsUpdate.mainMenu();
                if (userChoice == 1)
                    contactsUpdate.printContactlist();
                else if (userChoice == 2)
                    contactsUpdate.addContact();
                else if (userChoice == 3)
                    contactsUpdate.searchLastName();
                else if (userChoice == 4) {
                    contactsUpdate.deleteContact();
                } else if (userChoice == 5) {
                    contactsUpdate.exit();
                } else
                    System.out.println("Invalid input.");
            }
        }
    }



}


import java.util.Scanner;

public class UserInteraction {

    public static final Scanner scanner = new Scanner(System.in);

    public static int getResponse() {
        return scanner.nextInt();
    }

    // list menu options
    public static String returnDisplayMenu() {
        return """
                
                1. View contacts.
                2. Add a new contact.
                3. Search a contact by name.
                4. Delete an existing contact.
                5. Exit.
                
                Enter an option (1, 2, 3, 4 or 5):
                """;
    }

    public static int promptUserChoice() {

        return getResponse();
    }


    public static boolean getUserChoice(int userChoice) {

        ContactsResourceManager crm = new ContactsResourceManager();

        boolean continueRunning = true;

        switch (userChoice) {

            case 1 -> crm.printAllContacts();
            case 2 -> crm.addNewContact();
            case 3 -> crm.searchContact();
            case 4 -> crm.deleteContact();
            case 5 -> continueRunning = false;

        }

        return continueRunning;

    }


}

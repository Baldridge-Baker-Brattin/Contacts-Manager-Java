import java.util.*;


public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public int getResponse() {
        return scanner.nextInt();
    }

    public static void returnDisplayMenu() {
        System.out.printf(
                "1. View contacts.%n" +
                        "2. Add a new contact.%n" +
                        "3. Search a contact by name.%n" +
                        "4. Delete an existing contact.%n" +
                        "5. Exit.%n" +
                        "%n" +
                        "Enter an option (1, 2, 3, 4 or 5): %n");
    }

    public static void runInteraction() {
        returnDisplayMenu();
    }

    public void getUserChoice() {

        int userChoice = getResponse();

        if (userChoice == 1) {

            ContactsResourceManager.printAllContacts();

        } else if (userChoice == 2) {

            // add contact

        } else if (userChoice == 3) {

            // Search by name

        } else if (userChoice == 4) {

            // delete existing

        } else if (userChoice == 5) {



        } else {

            getUserChoice();
        }

    }






}


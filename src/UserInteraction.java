import java.util.Scanner;

public class UserInteraction {

    public static final Scanner scanner = new Scanner(System.in);

    public static int getResponse() {
        return scanner.nextInt();
    }

// list menu options
    public static String returnDisplayMenu() {
        return String.format("1. View contacts.%n" +
                        "2. Add a new contact.%n" +
                        "3. Search a contact by name.%n" +
                        "4. Delete an existing contact.%n" +
                        "5. Exit.%n");
    }

    public static int promptUserChoice() {
        int userChoice = getResponse();
        System.out.print("Enter an option (1, 2, 3, 4 or 5): ");
        return userChoice;
    }

    public static void getUserChoice(int userChoice) {

        if (userChoice == 1) {

            ContactsResourceManager.printAllContacts();

        } else if (userChoice == 2) {

            ContactsResourceManager crm = new ContactsResourceManager();
            crm.addNewContact();

        } else if (userChoice == 3) {

            // Search by name

        } else if (userChoice == 4) {

            // delete existing

        } else if (userChoice == 5) {

            // exit loop

        } else {
            getUserChoice(userChoice);
        }


    }





}

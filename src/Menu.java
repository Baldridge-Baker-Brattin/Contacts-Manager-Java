import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public String getResponse() {
        return scanner.next();
    }

    public static void returnDisplayMenu() {
        System.out.printf(
                "1. View contacts.%n" +
                "2. Add a new contact.%n" +
                "3. Search a contact by name.%n" +
                "4. Delete an existing contact.%n" +
                "5. Exit.%n" +
                "%n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    }

    public static void runInteraction() {
        returnDisplayMenu();
    }


}

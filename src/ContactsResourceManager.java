import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ContactsResourceManager extends UserInteraction implements Interact {

    private static final Path p = Paths.get("src", "contacts.txt");
    private static List<String> contacts = new ArrayList<>();


    public void getAllContacts() {

        try {

            contacts = Files.readAllLines(p);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public void printAllContacts() {

        getAllContacts();

        System.out.printf("Name  |  Phone number%n");
        System.out.printf("------------------------%n");

        for (String contact : contacts) {

            System.out.println(contact);
        }

    }


    public void addNewContact() {

        System.out.println("Enter first name");
        String userFirstName = scanner.next();

        System.out.println("Enter last name");
        String userLastName = scanner.next();

        System.out.println("Enter phone number");
        String userPhone = scanner.next();

        ArrayList<String> userContact = new ArrayList<>(Collections.singletonList(String.format(
                "%s %s | %s",
                userFirstName,
                userLastName,
                userPhone
        )));


        try {

            Files.write(p, userContact, StandardOpenOption.APPEND);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }


    public void searchContact() {

        System.out.println("Enter search criteria: ");
        String userInput = scanner.next();

        getAllContacts();

        for (String contact : contacts) {

            if (contact.toLowerCase().contains(userInput.toLowerCase())) {
                System.out.println(contact);
            }

        }
    }


    public void deleteContact() {

        getAllContacts();

        System.out.println("Enter entry to delete from entry list");
        String userInput = scanner.next().toLowerCase();

        try {
            ArrayList<String> contactsCopy = new ArrayList<>();

            for (String contact : contacts) {

                if (!contact.toLowerCase().contains(userInput)) {
                    contactsCopy.add(contact);
                }

            }
            Files.write(p, contactsCopy);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("%s deleted", userInput);


    }




}

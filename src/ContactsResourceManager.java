import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ContactsResourceManager extends UserInteraction implements Interact {

    private static final Path p = Paths.get("src", "contacts.txt");
    private static List<String> contacts = new ArrayList<>();

//    UserInteraction ui = new UserInteraction();


    public static void printAllContacts() {

        try {

            contacts = Files.readAllLines(p);

        } catch (IOException e) {

            e.printStackTrace();
        }

        for (String contact : contacts) {

            System.out.println(contact);
        }

    }


    public void addNewContact() {

        System.out.println("Enter name ");
        String userInput = scanner.nextLine();

        ArrayList<String> userContact = new ArrayList<>();
        userContact.add(userInput);

        try {

            Files.write(p, userContact, StandardOpenOption.APPEND); // append new contact

        } catch (IOException e) {

            e.printStackTrace();
        }

    }


}

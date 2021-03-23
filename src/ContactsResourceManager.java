import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactsResourceManager extends Contact {

    private static Path p = Paths.get("src","contacts.txt");

    private static List<String> contacts = new ArrayList<>();

    public ContactsResourceManager(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }


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

        String firstName = super.getFirstName();
        String lastName = super.getLastName();
        String phoneNumber = super.getPhoneNumber();

//        userContact Contact(firstName, lastName, phoneNumber);



//    Contact userContact = new ArrayList<>(Arrays.asList(
//            firstName,
//            lastName,
//            phoneNumber
//    ));

        try {

            Files.write(p, , StandardOpenOption.APPEND); // append new contact

        } catch (IOException e) {

            e.printStackTrace();
        }

    }






}

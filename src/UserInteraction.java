import java.util.Scanner;

public class UserInteraction {

    private final Scanner scanner = new Scanner(System.in);

    public int getResponse() {
        return scanner.nextInt();
    }


    public String getUserInput() {

        return scanner.nextLine();

    }

//    public String getUserLastName() {
//
//        return scanner.next();
//
//    }
//
//    public String getUserPhoneNumber() {
//
//        return scanner.next();
//
//    }

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


public class App {

    public static void main(String[] args) {

        System.out.println(UserInteraction.returnDisplayMenu());
        int userResponse = UserInteraction.promptUserChoice();
        UserInteraction.getUserChoice(userResponse);

//        ContactsResourceManager.printContacts();





    }

}

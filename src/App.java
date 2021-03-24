
public class App {

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            System.out.println(UserInteraction.returnDisplayMenu());

            int userResponse = UserInteraction.promptUserChoice();
            running = UserInteraction.getUserChoice(userResponse);

        }


    }

}

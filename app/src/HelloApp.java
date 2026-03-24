/**
 * HelloApp UC3 - Display "Hello" with Command-Line Argument or Default Message
 *
 * Description: The app accepts a user's name as a command-line argument and
 *              displays a personalized greeting. If no name is provided,
 *              it defaults to "World".
 *
 * @author Shourya Parashar
 * @version 3.0
 */
public class HelloApp {

    /**
     * Entry point of the application.
     * @param args Command-line arguments; args[0] optionally holds the user's name
     */
    public static void main(String[] args) {
        // Ternary operator: use args[0] if provided, otherwise default to "World"
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello, " + name + "!");
    }
}

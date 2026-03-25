/**
 * HelloApp UC7 - Display "Hello" with Multiple Command-Line Arguments
 *                using String.join() Method or Default Message
 *
 * Description: The app accepts zero or more command-line arguments and prints
 *              a greeting. It uses the String.join() method to efficiently
 *              concatenate multiple names with a specified delimiter.
 *              If no arguments are provided, it displays the default greeting:
 *              "Hello, World!".
 *
 * @author Shourya Parashar
 * @version 7.0
 */
public class HelloApp {

    /**
     * Entry point of the application.
     * @param args Command-line arguments; each arg optionally holds a user's name
     */
    public static void main(String[] args) {
        String names = (args.length == 0) ? "World" : String.join(", ", args);
        System.out.println("Hello, " + names + "!");
    }
}

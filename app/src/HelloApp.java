/**
 * HelloApp UC5 - Display "Hello" with Multiple Command-Line Arguments
 *                using Enhanced For Loop or Default Message
 *
 * Description: The app accepts zero or more command-line arguments and prints
 *              a greeting. It uses an enhanced for loop (for-each loop) to
 *              process multiple names. If no arguments are provided, it displays
 *              the default greeting: "Hello, World!".
 *
 * @author Shourya Parashar
 * @version 5.0
 */
public class HelloApp {

    /**
     * Entry point of the application.
     * @param args Command-line arguments; each arg optionally holds a user's name
     */
    public static void main(String[] args) {
        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}

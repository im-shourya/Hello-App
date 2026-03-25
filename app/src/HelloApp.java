/**
 * HelloApp UC4 - Display "Hello" with Multiple Command-Line Arguments or Default Message
 *
 * Description: The app accepts multiple names as command-line arguments and
 *              displays a personalized greeting for all names. If no names
 *              are provided, it defaults to "World".
 *
 * @author Shourya Parashar
 * @version 4.0
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
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}

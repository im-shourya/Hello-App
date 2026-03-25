/**
 * HelloApp UC6 - Display "Hello" with Multiple Command-Line Arguments
 *                using substring to Remove Trailing Delimiter
 *
 * Description: The app accepts zero or more command-line arguments and prints
 *              a greeting. It uses an enhanced for loop to process multiple names
 *              and the substring method to remove the trailing delimiter.
 *              If no arguments are provided, it displays the default greeting:
 *              "Hello, World!".
 *
 * @author Shourya Parashar
 * @version 6.0
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
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            // Remove the trailing ", " using substring
            names = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + names + "!");
    }
}

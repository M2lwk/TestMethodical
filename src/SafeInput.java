import java.util.Scanner;

/**
 * A utility library for handling safe, validated user input and text formatting.
 */
public class SafeInput {

    /**
     * Prompts the user for a String and ensures it is not empty.
     *
     * @param pipe   The Scanner instance connected to the input stream.
     * @param prompt The message displayed to the user.
     * @return A non-zero length String entered by the user.
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";
        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.length() == 0) {
                System.out.println("Error: Input cannot be empty. Please try again.");
            }
        } while (retVal.length() == 0);

        return retVal;
    }

    /**
     * Prompts the user for an integer and loops until a valid one is provided.
     *
     * @param pipe   The Scanner instance connected to the input stream.
     * @param prompt The message displayed to the user.
     * @return A valid integer entered by the user.
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean isValid = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear the newline buffer
                isValid = true;
            } else {
                trash = pipe.nextLine(); // Consume the invalid input string
                System.out.println("Error: \"" + trash + "\" is not a valid integer. Please try again.");
            }
        } while (!isValid);

        return retVal;
    }


    public static void prettyHeader(String msg) {
        int totalWidth = 60;

        // Line 1: Top border using a loop
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Line 2: Centered message line
        System.out.print("***"); // Left 3 asterisks

        // Calculate dynamic padding space
        int totalSpacesNeeded = totalWidth - 6 - msg.length();
        int leftSpaces = totalSpacesNeeded / 2;
        int rightSpaces = totalSpacesNeeded - leftSpaces;

        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***"); // Right 3 asterisks


        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


/**
 * PROMPT 4 - MAX 
 * @author has always been the coolest
 * @since he was born
 */

/**
 * 4. Write a method to find the maximum value in an array passed to it as a parameter.
 * Finds max value in an array
 * @param command line arguments
 */
public class PromptFour {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int value;

        if (args.length == 0) {
            System.err.println("Usage: java PromptFour <numbers>");
        } 
        else {
            for (String arg : args) {
                value = Integer.parseInt(arg);
                if (value > max) {
                    max = value;
                }
            }
        }
    }
}



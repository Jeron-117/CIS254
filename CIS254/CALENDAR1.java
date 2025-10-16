import java.util.Calendar;
import java.util.Scanner;

/**
 * Homework 4
 * Description: Prompts user to input name and birthyear then approximates user's age.
 * @author Jeron Montecillo
 * @since 9/9/2025
 */

public class CALENDAR1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Calendar currentDate = Calendar.getInstance();

        System.out.println("What should I call you?");
        String name = in.nextLine();
        System.out.println("Great! And what year were you born?");
        int birthyear = in.nextInt();
        int currentYear = currentDate.get(Calendar.YEAR);
        int age = currentYear - birthyear;
        System.out.println("So, " + name + ", your approximate age is " + age + " years old.");

        in.close();
    }
}
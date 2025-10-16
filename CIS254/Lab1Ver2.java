import java.util.Scanner;

/**
 * Description: This program converts Guatemalan Quetzales and Philppine Pesos to US Dollars vice versa using separate methods and a class constant for the rate.
 *              Converts overn'overn'overn'over until user is satisfied.
 * @author Jeron Montecillo
 * @since 2025-09-30
 */

public class Lab1Ver2{
   // --------- Conversion constants (mid-market reference) -----
   // 1 GTQ to USD 
    static final double DOLLAR_PER_QUETZAL = 0.1306;  // 1 GTQ ≈ 0.1306 USD
   // Keep the inverse consistent with the constant above:
    static final double QUETZAL_PER_DOLLAR = 1.0 / DOLLAR_PER_QUETZAL; // ≈ 7.6554 GTQ per USD
    static final double USD_PER_PHP = 0.017560471;
    static final double PHP_PER_USD = 56.946082;
    static int choice;
   /**
    * Shows the menu and makes appropriate call to conversion method. 
    * @param args command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double convert;
        char response;


        do {
            System.out.println("=== Currency Conversion Menu ===");
            System.out.println("1) GTQ -> USD");
            System.out.println("2) USD -> GTQ");
            System.out.println("3) PHP -> USD");
            System.out.println("4) USD -> PHP");
            System.out.print("Choose an option (1-4): ");
            int choice = sc.nextInt();


            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.print("Enter an amount to convert: ");
            }
            else {
                do {
                System.out.print("Invalid option.\nPlease enter a number that corresponds with your desired conversion (1-4): ");
                choice = sc.nextInt();
                }
                while (choice != 1 && choice != 2 && choice != 3 && choice != 4);
                System.out.print("Now enter an amount to convert: ");
            } double value = sc.nextDouble();


            switch (choice) {
            case 1:
                convert = Quetzal2Dollar(value);
                System.out.printf("Q%.2f = $%.2f%n", value, convert); // 2 decimals
                break;
            case 2:
                convert = Dollar2Quetzal(value);
                System.out.printf("$%.2f = Q%.2f%n", value, convert); // 2 decimals
                break;
            case 3:
                convert = PHP2USD(value);
                System.out.printf("%.2f PHP = %.2f USD%n", value, convert);
                break;
            case 4:
                convert = USD2PHP(value);
                System.out.printf("%.2f USD = %.2f PHP%n", value, convert);
                break;
            default:
                System.out.println("Invalid input.");
            }


            System.out.print("Enter 'Y' to start another conversion: ");
            response = sc.next().charAt(0);
        }
        while (response == 'Y');


        if (response != 'Y') {
            System.out.println("Leaving so soon... ");
        }


        sc.close();
   }



   /**
    * Converts Quetzales to US Dollars.
    * @param amountGTQ amount in Quetzales
    * @return amount in US Dollars
    */
   public static double Quetzal2Dollar(double amountGTQ) {
      return amountGTQ * 0.1306;
   }



   /**
    * Converts US Dollars to Quetzales.
    * @param amountUSD amount in US Dollars
    * @return amount in Quetzales
    */
   public static double Dollar2Quetzal(double sc) {
      return sc * 7.656967840735069;
   }



   /**
    * Converts PHP to USD
    * @param amountPHP amount in PHP
    * @return amount in USD
    */
   public static double PHP2USD(double amountPHP) {
      return amountPHP * 0.017560471;
   }



   /**
    * Converts USD to PHP
    * @param amountUSD amount in USD
    * @return amount in PHP
    */
   public static double USD2PHP(double amountUSD) {
      return amountUSD * 56.946082;
   }



}

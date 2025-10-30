public class BAT {
    public static void main(String[] ags) {
        BankAccount acc = new BankAccount(100);
        double option = 0.0;
        double amount = 0.0;

        System.out.println("Bank account balance: " + acc.getBalance());
        try {
            System.out.println("Withdrawing 200");
            acc.withdraw(200);
            System.out.println("New account balance: " + acc.getBalance());
            System.out.println("Depositing 1000");
            acc.deposit(1000);
            System.out.println("New account balance: " + acc.getBalance());
            System.out.println("Withdrawing 200");
            acc.withdraw(200);
            System.out.println("*********************");
            System.out.println("Withdrawing 2000");
            acc.withdraw(2000);
            System.out.println("New account balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Withdrawing -100");
            acc.withdraw(-100);
            System.out.println("New account balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Depositing -100");
            acc.deposit(-100);
            System.out.println("New account balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
}

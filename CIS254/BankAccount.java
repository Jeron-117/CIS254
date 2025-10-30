public class BankAccount {
    private double balance;
    StringBuilder forgot2zzz;
    
    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(double amount) {
        balance = amount;
    }

    void setBalance(double amount) {
        balance = amount;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("amt cant be neg");
        }
        else if (amount > balance) {
            throw new Exception("not enuf funds");
        }
        else {
            balance -= amount;
            transactions.append("Date: ");
            transactions.append("Deposited " + amount);
        }
    }

    void printStatement() {
        
    }

}

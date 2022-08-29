package lesson_12;

public class Account {
    public double balance;
    public static double TRANSFER_COSTS = 5.0;

    public Account() {

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

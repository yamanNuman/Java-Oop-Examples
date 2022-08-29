package lesson_12;

public class AccountClient {

    public void withdrawMoney(Account account,double amount) {
        account.balance = account.balance - amount;
    }

    public void depositMoney(Account account,double amount) {
        account.balance = account.balance + amount;
    }

    public void moneyTransfer(Account account1,Account account2,double amount,int x) {
        if(x == 1) {
            account1.balance = (account1.balance - amount) - Account.TRANSFER_COSTS;
            account2.balance = account2.balance + amount;
        }
        else if(x == 2) {
            account2.balance = (account2.balance - amount) - Account.TRANSFER_COSTS;
            account1.balance = account1.balance + amount;
        }
    }
}

package lesson_12;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setBalance(5000);
        Account account2 = new Account();
        account2.setBalance(10000);

        System.out.println("Account - 1 Balance : " + account1.getBalance());
        System.out.println("Account - 2 Balance : " + account2.getBalance());

        AccountClient client = new AccountClient();
        client.withdrawMoney(account1,2000);
        client.withdrawMoney(account2,5450);
        System.out.println("Account - 1 New Balance : " + account1.getBalance());
        System.out.println("Account - 2 New Balance : " + account2.getBalance());

        client.depositMoney(account1,5000);
        client.depositMoney(account2,6500);
        System.out.println("Account - 1 New Balance : " + account1.getBalance());
        System.out.println("Account - 2 New Balance : " + account2.getBalance());

        //1 account1 -> account2 trasnfer |||| 2 account2 -> account1 transfer
        client.moneyTransfer(account1,account2,3000,1);
        System.out.println("Account - 1 New Balance : " + account1.getBalance());
        System.out.println("Account - 2 New Balance : " + account2.getBalance());

    }
}

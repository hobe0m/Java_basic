package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);

        account.withdraw(9000);

        account.withdraw(2000);
    }

    /*
    이런 식으로도 가능하다.

    Account account = new Account();

    account.deposit(10000);

    account.withdraw(9000);

    account.withdraw(2000);

    System.out.println("잔고: " + account.balance);
    */
}

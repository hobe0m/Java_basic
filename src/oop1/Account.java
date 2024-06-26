package oop1;

public class Account {
    int balance; // 잔액

    int deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
        return balance;
    }

    int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금되었습니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + balance + "원");
        }
        return balance;
    }
    
    /*
    이런 식으로도 가능하다.
    int balance; // 잔액

    void deposit(int amount) {
    balance += amount;
    }

    void withdraw(int amount) {
    if (balance >= amount) {
    balance -= amount;
    } else {
        System.out.println("잔액 부족");
        }
    }
    */
}

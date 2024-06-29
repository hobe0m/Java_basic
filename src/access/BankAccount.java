package access;

public class BankAccount {
    // 캡슐화(Encapsulation) : 객체 지향 프로그래밍의 중요한 개념 중 하나
    //  - 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한
    //  - 즉, 외부에서 접근하여 데이터를 직접적으로 변경하는 것을 방지하거나 제한한다.
    //  - 속성과 기능을 하나로 묶고 외부에는 꼭 필요한 기능만 노출하며 나머지 기능은 숨기는 것이다.

    // 지금까지는 데이터와 데이터를 처리하는 메서드를 하나로 모으는 것에 초점을 맞추었지만, 여기서 한발짝 더 나아가 캡슐화를 안전하게 완성시켜주는 장치가 바로 접근 제어자이다.

    // 데이터(필수로 숨겨야 함)와 기능(내부에서만 사용하는 기능은 숨겨야 함)을 숨겨야 한다.
    //  - 데이터를 마음대로 변경할 수 있기 때문에 모든 안전망을 다 빠져나갈 수 있다.
    //  - 또한 자동차를 운전할 때 자동차 부품을 다 열어서 그 안에 있는 속도계를 직접 조절하지 않고 엑셀 기능만 이용하는 것처럼 기능도 숨겨둔다.
    //  - 따라서 객체 지향 프로그래밍에서 사용하는 대부분의 데이터들은 private로 막아둔다.
    //  - 기능을 숨기는 것은 필요한 것만 노출하고 나머지 기능을 숨기라는 것이다.

    // 데이터는 모두 숨겨져 있고 꼭 필요한 기능외에 나머지 기능들도 숨겨져 있는 것이 좋은 캡슐화이다.
    // 따라서 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.

    // 캡슐화가 잘 된 객체 지향 프로그래밍
    private int balance;

    // alt + insert : 생성자, getter / setter 등을 자동으로 만들어주는 단축키
    // 생성자, 은행 계좌 객체를 생성하면 잔액을 0으로 설정
    // int형의 초기값이 0이기에 사실 생성자를 사용 안해도 된다.
    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : deposit(입금)
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            // 0원 이하면 입금 불가
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 들어온 금액이 정상적인 금액인 지 확인하는 메서드
    // 내부에서만 사용하기 때문에 private 사용
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 한다.
        return amount > 0;
        // 0보다 큰 경우 true, 아닌 경우 false 반환
    }

    // public 메서드 : withdraw(출금)
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : getBalance(잔액 확인)
    public int getBalance() {
        return balance;
    }
}

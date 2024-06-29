package access;

public class BankAccountMain {
    // 은행 계좌 기능
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance : " + account.getBalance());
    }

    // 만약 isAmountValid()를 외부에 노출하면, 입금과 출금 전 검증하는 코드를 본인이 짜야하는 지 고민될 것이므로 노출하지 말아야 한다.
    // 또한 balance 필드를 외부에 노출하면, 잔고를 마음대로 조정할 수 있기 때문에 막아둬야 한다.
    // 외부에 노출한다는 것은 협업 간 다른 사람이 쓸 수 있게끔 하는 것(public이면 당연히 쓸 수 있다고 생각)이므로 주의해야 한다.
    // 따라서 접근 제어자와 캡슐화를 통해 안전하게 보호하는 것은 물론이고 BankAccount를 사용하는 개발자 입장(협업자)에서 해당 기능을 사용하는 복잡도도 낮출 수 있다.
}

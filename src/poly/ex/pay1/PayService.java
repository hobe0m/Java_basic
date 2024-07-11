package poly.ex.pay1;

public class PayService {

    // PayService는 구체적인 결제 수단이 아니라 Pay에 의존한다.
    // 따라서 결제 수단을 추가해도 PayService의 코드에는 변경이 없다.

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다.");
        System.out.println("option : " + option + ", amount : " + amount);

        // 결제 수단을 찾는 부분
        Pay pay = PayStore.findPay(option);

        // 결제 수단을 실행하는 부분
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
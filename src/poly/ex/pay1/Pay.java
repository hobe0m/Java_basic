package poly.ex.pay1;

public interface Pay {
    // 새로운 결제 수단을 추가했을 때, Pay를 사용하는 클리이언트 코드인 PayService의 변경을 최소화 할 수 있다면 성공

    boolean pay(int amount);
}

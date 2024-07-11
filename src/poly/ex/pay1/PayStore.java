package poly.ex.pay1;

public abstract class PayStore {
    // 결제 수단을 보관하고 있는 곳
    // 결제 수단 추가 시 변하는 부분
    // 결제 수단의 이름으로 실제 결제 수단 구현체를 찾는다.
    // static(정적)으로 기능을 제공하고, 추상 클래스로 선언해서 객체 생성을 막는다.
    // 결제 수단을 찾지 못했을 때 DefaultPay()를 사용하여, null이 아닌 항상 실패하는 결제 수단을 사용한다.
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}

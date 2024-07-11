package poly.ex.pay1;

public class DefaultPay implements Pay {
    // Null Object Pattern
    // 결제 수단이 없을 때 사용하는 코드
    // DefaultPay를 사용하면 null 체크를 피할 수 있다.
    // kakao, naver 등의 결제 수단이 없을 때 항상 실패하는 결제 수단 사용
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

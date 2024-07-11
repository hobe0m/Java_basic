package poly.ex.pay0;

public class PayService {
    // 결제를 진행하는 핵심 로직

    public void processPay(String option, int amount) {
        boolean result;

        System.out.println("결제를 시작합니다.");
        System.out.println("option : " + option + ", amount : " + amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}

package ref;

public class InitMain {
    // 변수와 초기화
    // 변수의 종류
    //  - 멤버 변수(필드) : 클래스에 선언
    //  - 지역 변수 : 메서드에 선언, (메서드의)매개변수도 지역변수의 한 종류이다.
    //   - 지역 변수는 이름 그대로 특정 지역에서만 사용되는 변수이다.
    //   - 해당 메서드가 끝나면 제거된다.

    // 변수의 값 초기화
    //  - 멤버 변수 : 자동 초기화
    //   - 인스턴스 멤버 변수는 인스턴스를 생성할 때 자동 초기화된다.
    //   - 숫자는 0, boolean은 false, 참조형은 null
    //   - 하지만 개발자가 초기값을 직접 지정할 수 있다.
    //  - 지역 변수 : 수동 초기화
    //   - 지역 변수는 항상 직접 초기화 해야 한다.
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 : " + data.value1);
        System.out.println("value2 : " + data.value2);

        // 멤버 변수는 초기 값을 지정하지 않아도 자동 초기회된다.
        // 추가로 사용자가 직접 지정해서 초기화해도 된다.
    }
}

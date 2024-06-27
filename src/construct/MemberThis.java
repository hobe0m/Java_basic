package construct;

public class MemberThis {
    // this의 생략
    // this는 생략할 수 있다.
    // 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수이다)를 먼저 찾고 없으면 그 다음으로 멤버 변수를 찾는다.
    // 만약 멤버 변수도 없으면 오류가 발생한다.
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        // 이렇게 멤버 변수와 매개 변수의 이름이 다를 경우에는 this를 안쓰고도 프로그래밍을 할 수 있다.
        // 지역 변수(코드 블럭 내부, 여기서는 메서드 안)에 없으면 자동으로 멤버 변수(클래스 안)을 찾아보기 때문이다.

        // 번외로 멤버 변수에 접근하는 경우에는 항상 this를 사용하는 코딩 스타일도 있다.
        // this를 적어주지 않아도 됨에도 불구하고 this를 항상 적는 스타일(과거에 사용), 권장하지 않는다.
        // 하지만 지금은 IDE가 발전하면서 IDE가 멤버 변수와 지역 변수를 색상으로 구분해준다.
        // 이름이 중복되는 경우에만 this를 사용하자
        // 관습을 따를 때는 왜 쓰는지 생각해봐야 한다.
        //  - 그 이유가 없다면 안쓰는 게 맞다.
        // IDE : Integrated Development Environment, 소프트웨어 개발을 위해 통합된 환경을 제공하는 도구
        //  - EX : 인텔리제이, 이클립스..
    }
}

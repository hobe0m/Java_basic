package final1;

public class Constant {
    // 상수(Constant)
    //  - 상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다.
    //  - 자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 상수라 핟나.
    //  - 이런 이유로 상수는 static final 키워드를 사용한다.

    // 자바 상수의 특징
    //  - final static 키워드를 사용한다.
    //  - 대문자를 사용하고 구분은 _(언더 스코어, 언더 바)로 한다(관례).
    //   - 일반적인 변수와 상수를 구분하기 위해 이런 식으로 사용
    //  - 필드를 직접 접근해서 사용한다.
    //  - 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다.
    //  - 상수는 값을 변경할 수 없으므로 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.
    //   - 이전에는 값을 바꾸면 안되기 때문에 private으로 제한해서 사용했다.
    //   - 상수는 이런 문제가 없기 때문에 직접 접근해서 사용해도 문제가 없다.
    //   - Constant.HOURS_IN_DAY 이런 식으로 클래스에 있는 상수에 직접 접근하여 사용한다.

    // 수학 상수
    public static final double PI = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTES = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 2000;

    // 보통 상수들은 애플리케이션 전반에서 사용되기 때문에 public을 주로 사용하지만 특정 위치에서만 사용된다면 다른 접근 제어자를 사용하면 된다.
    // 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점도 가진다.
    // 상수는 런타임에 변경할 수 없고, 변경하려면 프로그램을 종료하고 코드를 변경한 다음에 프로그램을 다시 실행해야 한다.
}

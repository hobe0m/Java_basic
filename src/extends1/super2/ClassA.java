package extends1.super2;

import java.sql.SQLOutput;

public class ClassA {
    // super - 생성자
    // 상속 관계의 인스턴스 생성 시 메모리 내부에는 부모, 자식 클래스가 다 만들어진다.
    // 따라서 각각의 생성자도 모두 호출되어야 한다(한번에 다 만들어지므로).

    // 상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다(규칙).
    // 상속 관계에서 부모의 생성자를 호출할 때는 super(...)를 사용하면 된다.
    // 안하면 컴파일 오류 발생

    // 최상위 부모 클래스
    public ClassA() {
        System.out.println("ClassA 생성자");
    }
}

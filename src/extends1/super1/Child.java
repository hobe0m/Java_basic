package extends1.super1;

import java.sql.SQLOutput;

public class Child extends Parent{

    // 부모와 동일한 변수 이름 사용
    public String value = "child";

    // 메서드 오버라이딩
    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value : " + this.value); // 자식의 value, this를 생략하면 내꺼(Child) 먼저 찾는다.
        System.out.println("super value : " + super.value); // 부모의 value

        this.hello();
        super.hello();
    }
}

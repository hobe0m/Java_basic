package extends1.super2;

public class ClassB extends ClassA{
    // 상속 받은 부모를 생성자 첫줄에 입력해주어야 한다.
    // 이 때, 기본 생성자이면 생략 가능하다.
    public ClassB(int a) {
        super(); // 부모 클래스의 기본 생성자(기본 생성자 일경우 생략 가능)
        System.out.println("ClassB 생성자 a : " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a : " + a + " b : " + b);
    }
}

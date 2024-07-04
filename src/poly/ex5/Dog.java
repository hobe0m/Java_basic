package poly.ex5;

public class Dog implements InterfaceAnimal {
    // 인터페이스는 extends가 아닌 구현이라는 뜻의 implements를 사용한다.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개가 이동합니다.");
    }
}

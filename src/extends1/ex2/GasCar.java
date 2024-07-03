package extends1.ex2;

public class GasCar extends Car{
    // 자식 클래스는 extends를 통해 어떤 클래스(부모)를 상속받을 것인지 명시적으로 표현한다.

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}

package extends1.overriding;

public class Car {
    // 상속과 메서드 오버라이딩
    // 부모 타입의 기능을 자식에서는 다르게 재정의 하고 싶을 수 있다.
    // 예를 들어 자동차가 이동한다는 move()를 전기차의 경우 빠르게 이동한다고 변경하고 싶을 수 있다.
    // 이렇게 부모한테서 받은 기능을 자식이 재정의 하는 것을 메서드 오버라이딩(Overriding)이라 한다.

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}

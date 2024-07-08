package poly.car1;

public interface Car {
    // 다형성, 역할과 구현 예제
    // 다형성을 활용해 역할과 구현을 분리해서, 클라이언트 코드의 변경 없이 구현 객체를 변경할 수 있다.
    // 클라이언트 : Driver
    // 클래스 의존 관계는 클래스 상에서 어떤 클래스를 알고 있는 가를 뜻한다.
    void startEngine();
    void offEngine();
    void pressAccelerator();
}

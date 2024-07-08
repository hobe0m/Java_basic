package poly.car1;

public class NewCar implements Car {
    // OCP(Open-Closed-Principle) 원칙, 좋은 객체 지향 설계 원칙 중 하나
    // Open for extension : 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
    // Closed for modification : 기존의 코드는 수정되지 않아야 한다.
    // 즉, 확장에는 열려있고, 변경에는 닫혀있다는 뜻인데 쉽게 이야기 해서 기존의 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미

    // 확장에 열려있다는 것은 Car 인터페이스를 사용해서 새로운 차량을 자유롭게 추가할 수 있다는 것과 클라이언트 코드인 Driver도 Car 인터페이스를 통해 새롭게 추가된 차량을 자유롭게 호출할 수 있는 것이다.
    // 코드 수정은 닫혀있다는 것은 새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정은 불가피하며 당연하게도 어딘가의 코드는 수정해야 한다는 것이다.
    // 변하지 않는 부분(Closed for modification)은 클라이언트 코드인 Driver이다.
    // 변하는 부분(Open for extension)은 main()과 같이 새로운 차를 생성하고 Driver에게 필요한 차를 전달해 주는 역할은 당연히 코드 수정이 발생한다.
    //  - main()은 전체 프로그램을 설정하고 조율하는 역할을 하기 때문에 이런 부분은 OCP를 지켜도 변경이 필요하다.

    // 따라서 Car를 사용하는 클라이언트 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
    // 다형성을 활용하고 역할과 구현을 잘 분리한 덕분에 새로운 자동차를 추가해도 대부분의 핵심 코드들을 그대로 유지할 수 있게 되었다.

    // 전략 패턴(Strategy Pattern)
    //  - 디자인 패턴 중 가장 중요한 패턴을 하나 뽑으라고 하면 전략 패턴을 뽑을 수 있다.
    //  - 전략 패턴은 알고리즘을 클라이언트 코드의 변경 없이 쉽게 교체할 수 있다.
    //  - 방금 설명한 코드가 전략 패턴을 사용한 코드이다.
    //  - Car 인터페이스가 바로 전략을 정의하는 인터페이스가 되고, 각각의 차량이 전략의 구체적인 구현이 된다.
    //  - 또한 전략을 클라이언트 코드(Driver)의 변경 없이 손쉽게 교체할 수 있다.

    // 런타임에 알고리즘을 선택할 수 있게 해주는 패턴
    // 서로 다른 알고리즘을 독립적으로 정의하고, 클라이언트 코드에서는 이러한 알고리즘을 쉽게 변경할 수 있다.

    // 새로운 차량의 추가로 보는 OCP 원칙의 준수
    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}

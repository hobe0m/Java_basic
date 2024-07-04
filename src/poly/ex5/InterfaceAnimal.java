package poly.ex5;

public interface InterfaceAnimal {
    // 인터페이스 : 순수 추상 클래스를 더 편리하게 사용할 수 있는 기능
    // 인터페이스는 class가 아니라 interface 키워드(즉, public abstract 생략 가능)를 사용해야 한다.

    // 인터페이스의 메서드는 모두 public abstract이다.
    // 메서드에 public abstract를 생략할 수 있고, 생략이 권장(거의 필수)된다.
    // 다중 구현(다중 상속)을 지원한다.

    // 인터페이스에 멤버 변수를 넣을 수 있는데 인터페이스에서의 멤버 변수는 public, static, final이 모두 포함되었다고 가정한다.
    // 즉, 멤버 변수에 상수만 넣을 수 있다.
    // 인스턴스와는 무관하고 인터페이스에서 제공하는 상수(값에 접근해서 사용 가능)라고 생각하면 된다.

    // 클래스의 상속 관계는 UML에서 실선을 사용하지만, 인터페이스 구현(상속) 관계는 UML에서 점선을 사용한다.
    // 물려서 받을 기능이 없고 모든 기능을 모두 구현해야 하기 때문에 상속이 아니라 구현이라고 표현한다.ㄴ

    void sound(); // public abstract 생략(필수)
    void move(); // public abstract 생략(필수)
}

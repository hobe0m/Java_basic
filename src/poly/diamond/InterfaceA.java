package poly.diamond;

public interface InterfaceA {
    // 인터페이스 다중 구현
    // 자바가 다중 상속을 지원하지 않는 이유
    //  - 클래스 계층 구조가 매우 복잡해지고, 동일한 메서드명이 있을 때 어떤 부모의 메서드를 가져와야 할 지 모르기 때문(다이아몬드 문제)이다.
    // 따라서 이러한 문제를 인터페이스의 다중 구현을 통해 피한다.
    // 인터페이스의 다중 구현이 허용되는 이유는 인터페이스가 추상 메서드로만 이루어져 있기 때문이다.
    // 인터페이스는 똑같은 메서드명을 가지더라도 자식이 구현하기 때문에 문제가 되지 않는다.

    void methodA(); // public abstract 생략
    void methodCommon(); // public abstract 생략
}

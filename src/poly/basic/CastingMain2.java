package poly.basic;

public class CastingMain2 {
    // 캐스팅의 종류
    // 자식 타입의 기능을 사용하려면 다운캐스팅 결과를 변수에 담아두고 이후에 기능을 사용하면 된다.
    // Child child = (Child) poly
    // child.childMethod();
    // 하지만 다운캐스팅 결과를 변수에 담아두는 과정이 번거롭다.
    // 이런 과정 없이 일시적으로 다운캐스팅을 해서 인스턴스에 있는 하위 클래스의 기능을 바로 호출할 수도 있다.

    public static void main(String[] args) {
        // 기존에 사용하던 방법, 다운캐스팅 후 기능 호출
        Parent poly = new Child();
        Child child = (Child) poly;
        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅(순간적 사용)
        ((Child) poly).childMethod();
        // poly를 Child 타입으로 바꿔줄 때 괄호를 통해 연산자 우선 순위를 높여 일시적으로 다운캐스팅 해준다.

        // 마찬가지로 poly 자체가 Child 타입으로 변하는 것이 아니다.
        // 실행 순서
        // ((Child) poly).childMethod();, 다운 캐스팅을 통해 부모 타입을 자식 타입으로 변환 후 기능 호출
        // ((Child) x001).childMethod();, 참조값을 읽은 다음 자식 타입으로 다운캐스팅

    }
}

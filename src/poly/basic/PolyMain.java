package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        // Child 인스턴스를 만들면 자식 타입인 Child를 생성했기 때문에 메모리 상에 Child와 Parent가 모두 생성된다.
        // 그 후 생성된 참조값을 Parent 타입의 변수인 poly에 담아둔다.
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // poly가 Parent 타입이므로 참조값을 찾아 들어가서 우선적으로 Parent 부터 확인한다.ㄴ
        poly.parentMethod();

        // 부모 타입에 자식 인스턴스를 참조할 수 있지만, 자식의 기능은 호출할 수 없다(컴파일 오류 발생).
        // 부모는 자식이 누군지 어떠한 기능을 가지는 지 모르기 때문이다.
        // poly.childMethod();는 불가하다.

        // 즉, 자식인 Child 인스턴스는 메모리 상에 부모와 자식의 인스턴스를 모두 생성하므로 Parent 타입의 poly에 넣을 수 있는 것이다.
        // 부모 타입은 자식 타입을 참조할 수 있다.
        // 반대로 자식 타입은 부모 타입을 참조할 수 수 없다.
        //  - 메모리에 자식 하나만 생성되기 때문이다.
        
        // Child child1 = new Parent(); 부모를 자식에 담는 것은 불가, 컴파일 오류 발생

        // 자바에서 부모 타입은 자신을 포함한 모든 자식 타입을 참조할 수 있다.
        // 이것이 바로 다양한 형태를 참조할 수 있다는 다형적 참조이다.

        // 다형적 참조의 한계
        // 부모 타입으로 자식 인스턴스를 참조해도 자식의 기능은 사용할 수 없는 이유
        //  - 타입이 부모의 타입이기에 클래스에 정의되어 있지 않다.
        //  - 상속 관계에서는 메모리에서 부모의 타입부터 찾아보고 나서 기능이 없을 때 자식으로 찾아 내려갈 수 없다.
        //  - 따라서 상위의 부모가 없으므로 자식 기능을 호출하려고 하면 컴파일 오류가 발생한다.
        // 이런 경우 childMethod() 호출하고 싶으면 캐스팅이 필요하다.

        // 다형적 참조의 핵심은 부모는 자식을 품을 수 있다는 것이다.
        // 지금은 왜 불편하게 다형적 참조를 쓸까라는 의문이 들 수 있지만 다형성의 다른 이론들을 알게 되면 이해할 수 있다.

    }
}

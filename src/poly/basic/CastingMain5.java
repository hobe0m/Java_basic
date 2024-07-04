package poly.basic;

public class CastingMain5 {
    // instanceof
    // 다형성에서 참조형 변수는 이름 그대로 다양한 자식을 대상으로 참조할 수 있다.
    // 이 때 참조하는 대상이 다양하기 때문에 어떤 인스턴스를 참조하는지 헷갈릴 때 instanceof를 활용해 확인할 수 있다.
    // instanceof는 쉽게 이야기 해서 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해보면 된다.
    //  - 대입이 가능하면 true, 아니면 false가 된다.
    //  - 그렇기 때문에 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true를 반환한다.
    //  - 부모는 자식을 담을 수 있고, 자식은 부모를 담을 수 없다.
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent1 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) { // parent 객체를 받는데 이 객체가 Child 클래스의 객체인지 instanceof로 확인한다.
                                       // 이렇게 다운캐스팅을 하기 전에는 instanceof를 사용해 원하는 타입으로 변경이 가능한지 확인한 후 다운캐스팅을 수행하는 것이 안전하다.
                                       // 즉, 다운캐스팅을 쓸 때는 instanceof를 같이 쓰자
            System.out.println("Child 인스턴스가 맞습니다.");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 아닙니다.");
        }
    }
}

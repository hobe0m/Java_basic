package poly.basic;

public class CastingMain6 {
    // Pattern Matching for instanceof - Java 16 이상부터 사용 가능
    //  - instanceof를 사용하면서 동시에 변수 선언 가능
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // instanceof문 오른쪽에 변수 선언 가능, 사용하면 Child child = (Child) parent; 생략 가능
                                             // 이렇게 쓰면 다운캐스팅을 실행한 것과 다름없다.
            System.out.println("Child 인스턴스가 맞습니다.");
            child.childMethod();
        }
    }
}

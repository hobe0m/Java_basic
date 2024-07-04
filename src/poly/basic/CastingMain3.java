package poly.basic;

public class CastingMain3 {
    // 업캐스팅(upcasting) vs 다운캐스팅(downcasting)

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략이 기본, 부모는 자식을 품을 수 있기 때문이다.
        Parent parent2 = child; // 이렇게 쓰는 것이 맞다.

        parent1.parentMethod();
        parent2.parentMethod();

        // 그렇다면 왜 다운캐스팅은 개발자가 직접적으로 명시를 해야할까?
    }
}

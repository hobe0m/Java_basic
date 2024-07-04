package poly.basic;

public class CastingMain1 {
    // 다형성과 캐스팅
    // Parent poly = new Child(); 와 같이 부모 타입의 변수를 사용하게 되면 poly.childMethod()와 같은 자식 타입에 있는 기능은 호출할 수 없다.
    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 단, 자식의 기능은 호출할 수 없음, 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        // 자식은 부모를 담지 못하므로 강제로(명시적으로) 형변환을 시켜줘야 한다.
        // (타입) 처럼 괄호와 그 사이에 타입을 지정하면 참조 대상을 특정 타입으로 변경할 수 있다.
        //  - 이렇게 특정 타입으로 변경하는 것을 캐스팅이라고 한다.
        Child child = (Child) poly;
        child.childMethod();

        // poly.childMethod(); 위에서 복사값을 다운캐스팅 했기 때문에 poly는 여전히 Parent 타입이다.

        // 실행 순서
        // Child child = (Child) poly;, 다운 캐스팅을 통해 부모타입을 자식 타입으로 변환한 다음 대입 시도
        // Child child = (Child) x001;, 참조값을 읽은 후(poly -> x001) 자식 타입으로 지정
        // Child child = x001;, 최종 결과
        // 참고로 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것이 아니다.
        //  - 기존의 대원칙처럼 Parent poly의 참조값을 꺼내서 복사 후 그 것을 Child 타입으로 변환하는 것이므로 poly의 타입은 기존과 같이 Parent 타입으로 유지된다.

        // 부모는 자식을 담을 수 있지만, 자식은 부모를 담을 수 없다.

        // 캐스팅의 종류
        // 업캐스팅(upcasting) : 부모 타입으로 변경(부모 타입으로 올라간다고 해서 업)
        // 다운캐스팅(downcasting) : 자식 타입으로 변경(자식 타입으로 내려간다고 해서 다운)
    }
}

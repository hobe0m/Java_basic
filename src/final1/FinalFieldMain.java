package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화(생성자를 통해 초기화 된 경우)
        System.out.println("생성자 초기화");
        ConstrustInit construstInit1 = new ConstrustInit(10);
        ConstrustInit construstInit2 = new ConstrustInit(20);

        // ConstructInit에 정의된 필드가 final로 지정되었으므로 생성자를 통해 값을 할당하면 이후에 다른 값을 재할당할 수 없다.
        System.out.println(construstInit1.value);
        System.out.println(construstInit2.value);

        // final 필드 - 필드 초기화(필드에서 초기화 된 경우)
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수 출력");
        System.out.println(FieldInit.CONST_VALUE); // 자바에서 상수의 경우 관례적으로 모두 대문자로 써준다.

        // 생성자를 통해 초기화를 하는 경우 객체 생성 시 객체마다 다른 값을 할당할 수 있다.
        //  - 물론 그 이후에는 값을 재할당할 수 없다.
        //  - final을 쓰더라도 변수로써의 의미가 있다.

        // 필드에서 이미 final을 통해 값이 초기화된 경우에는 인스턴스를 몇개를 만들어도 값은 초기화된 값으로 동일하게 지정되어 있다.
        //  - 마찬가지로 값을 재할당 할 수 없다.
        //  - 이런 경우 모든 인스턴스가 같은 값을 사용하기 때문에 여러 개를 만들 경우 메모리를 낭비하게 된다.
        //  - 또한 메모리 낭비를 떠나서 같은 값이 계속 생성되기에 개발자가 명확한 중복처럼 느낄 수 있다.
        //  - 따라서 이럴 때 필요한 것이 static이다.

        // static final
        // static을 붙이면 공유하는 변수가 되기 때문에 필드를 한번 값을 할당하면 다시 할당할 수 없는 final로 지정을 했을 때 효율적이다.
        //  - 메모리의 비효율과 중복 문제 모두 해결할 수 있는 것이다.
        //  - 이러한 이유로 final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
    }
}

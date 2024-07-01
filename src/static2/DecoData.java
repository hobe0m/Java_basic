package static2;

public class DecoData {
    // static 메서드
    // 정적 메서드는 객체 생성 없이 클래스에 있는 메서드를 바로 호출할 수 있다는 장점이 있지만 언제나 사용 가능한 것은 아니다.

    // 정적 메서드 사용법
    // static 메서드는 static만 사용할 수 있다.
    //  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 static이 붙은 정적 메서드나 정적 변수만을 사용할 수 있다.
    //  - static이 붙게 되면 클래스 소속이기 때문에 자신의 클래스 소속인 static(정적) 메서드나 변수만을 사용할 수 있는 것이다.
    //  - 즉, 클래스 내부의 기능을 사용할 때 정적 메서드는 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.

    // 반대로 모든 곳에서 static을 호출할 수 있다.
    //  - 정적 메서드는 공용 기능이므로 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있다.
    //  - 접근이 제한되는 것이 아니라 객체를 생성하지 않고 메서드를 실행하는 것이기 때문이다.

    // static 본인은 static이 붙은 것만 호출할 수 있지만, 어디에서든 접근 제어자만 허락한다면 클래스를 통해 static을 호출할 수 있다.

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;
        staticMethod();
    }

    // 매개 변수에 직접 참조값 부여
    public static void staticCall(DecoData data) {
        // instanceValue++; 인스턴스 변수에 접근 불가, 컴파일(compile) 에러
        // instanceMethod(); 인스턴스 메서드에 접근 불가, 컴파일(compile) 에러
        // 인스턴스 변수는 인스턴스를 생성해야 알 수 있기 때문에 클래스 측면에서는 알 수 없다.
        // 즉, 클래스 내부에 있는 것(붕어빵틀)들만 알 수 있다.

        staticValue++; // 정적 변수에 접근 가능
        staticMethod(); // 정적 메서드에 접근 가능
    }
    
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수에 접근 가능, DecoData.staticValue와 같기 때문
        staticMethod(); // 정적 메서드에 접근 가능, DecoData.staticMethode와 같기 때문
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}

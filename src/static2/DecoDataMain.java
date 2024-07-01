package static2;

// import static static2.DecoData.*; 전체 메서드를 사용할 때는 *을 사용
// import static static2.DecoData.staticCall; 메서드 지정 시 사용

public class DecoDataMain {
    public static void main(String[] args) {

        System.out.println("1. 정적 호출");

        // 여러 번 호출 시 클래스 명을 계속 붙여주는게 불편하다.
        // import static : 정적 메서드(staticCall)을 사용할 것이라고 정의하는 것
        DecoData.staticCall();

        // static 변수는 증가, instance 변수는 생성되므로 1
        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        // static 변수는 증가, instance 변수는 다시 생성되므로 1
        System.out.println("2. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 매개 변수에 직접 참조값 부여
        DecoData.staticCall(data1);

        // 인스턴스를 통한 접근도 가능하지만 클래스를 통한 접근을 권장
        DecoData data3 = new DecoData();
        data3.staticCall();
        // 이런 경우는 인스턴스에 갔다가 클래스로 이동하는 것
        // 이렇게 쓰면 인스턴스 소속같기 때문에 이렇게 쓰면 안된다.

        // 클래스를 통한 접근
        DecoData.staticCall();
    }

    // 정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유
    //  - 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있어 인스턴스처럼 참조값이 없다.
    //  - 특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데 정적 메서드는 참조값 없이 호출하므로(참조값을 알 수 있는 방법이 없다) 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다

    // 만약 정적 메서드가 객체의 참조값을 직접 매개 변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출할 수 있다.

    //  public static void staticCall(Decodata data) {
    //      data.instanceValue++;
    //      data.instanceMethod();
    //  }
    
    // 용어 정리
    // 멤버 메서드의 종류
    //  - 인스턴스 메서드 : static이 붙지 않은 멤버 메서드(객체 생성 필요, 객체에 소속되어 있음)
    //  - 클래스 메서드 : static이 붙은 멤버 메서드(객체 생성 불필요, 클래스에 소속되어 있음)
    //   - 클래스 메서드, 정적 메서드, static 메서드 등으로 부른다.

    // 정적 메서드 활용
    //  - 정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용
    //  - 예를 들어 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주 사용
    //  - 인스턴수 변수 없이 입력한 값을 계산하고 반환하는 경우(수학의 기능) 많이 사용

    // 정적 메서드 접근
    //  - 클래스를 통해 바로 접근 가능하고, 매개 변수에 직접 참조값(객체)을 넣어주면 인스턴스를 통해서도 가능하다.

    // static import
    // 특정 클래스의 정적 메서드를 자주 사용할 때 import 후 static static2.DecoData.staticCall과 같이 생략할 메서드 명을 적어주면 된다.
    // 참고로 import는 정적 메서드 뿐만 아니라 정적 변수에도 사용할 수 있다.

    // main() 메서드는 정적 메서드
    // 인스턴스 생성 없이 실행하는 가장 대표적인 메서드가 바로 main() 메서드이다.
    // main() 메서드는 프로그램을 시작하는 시작점이 되는데, 생각해보면 객체를 생성하지 않아도 main() 메서드가 작동한다.
    //  - 이는 main() 메서드가 static이기 때문이다.
    // 정적 메서드는 정적 메서드만 호출할 수 있기에 main()과 같은 클래스에서 호출하는 메서드를 모두 정적 메서드로 선언해서 사용했다.
}

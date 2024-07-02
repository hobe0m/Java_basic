package final1;

public class FinalLocalMain {
    // final
    // final 변수와 상수
    // 변수에 final 키워드가 붙으면 더는 값을 변경할 수 없는 상수가 된다.
    // 단어 그대로 마지막이라는 뜻이다.
    // 참고로 final은 class, method를 포함한 여러 곳에 붙을 수 있지만 지금은 변수에 붙는 것만 알아보자
    public static void main(String[] args) {
        // final 지역 변수 1
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20;  이후에 다시 값을 지정하면 컴파일 오류가 발생한다.

        // final 지역 변수 2
        final int data2 = 10; // 최초 한번 할당
        // data2 = 20; 두 번째 값 지정이기에 불가

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20;, 이미 인수로 10이 들어온 상태에서 20이 다시 지정되는 것이므로 불가
        // final은 한번 값이 할당되면 거기에서 끝이다.
    }

    // final을 지역 변수에 설정할 경우 최초 한번 할당 가능, 이후에 값 변경 불가(컴파일 오류)
    // final을 지역 변수에 선언하면서 바로 초기화 한 경우 이미 값이 할당되었기에 다시 값을 할당할 수 없음(컴파일 오류)
    // 매개 변수에 final이 붙으면 메서드 내부에서 매개 변수의 값을 변경할 수 없음
    //  - 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.

}


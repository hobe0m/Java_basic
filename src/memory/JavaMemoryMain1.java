package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        // ctrl + w : 하나의 단어 범위 선택, 여러 번 반복해서 누르면 더 큰 범위 선택 가능
        // 스택 구조의 예시
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }

    // 자바는 스택 영역을 사용해서 메서드 호출(메서드 자체는 메서드 영역)과 지역 변수(매개 변수 포함)를 관리한다.
    // 메서드를 계속 호출하면 스택 프레임이 계속 쌓인다.
    // 지역 변수(매개 변수 포함)는 스택 영역에서 관리한다.
    // 스택 프레임이 종료되면 지역 변수도 함께 제거된다.
    // 스택 프레임이 모두 종료되면 프로그램도 종료된다.
}

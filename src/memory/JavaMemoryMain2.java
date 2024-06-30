package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value : " + data2.getValue());
        System.out.println("method2 end");
    }

    // method1()이 종료된 직후, method1()의 스택 프레임이 제거되고 지역 변수 data1도 함께 제거
    // 이제 x001 참조값을 가진 Data 인스턴스를 참조하는 곳이 더는 없으므로 GC가 메모리에서 제거한다.
    // 참고 : 힙 영역 외부가 아닌, 힙 영역 안에서만 인스턴스끼리 서로 참조하는 경우에도 GC의 대상이 된다.
    // 지역 변수는 스택 영역에, 객체(인스턴스)는 힙 영역에서 관리, 메서드 영역이 관리하는 변수도 있는데 그것을 이해하기 위해서는 static 키워드 부터 알아야 한다.

}

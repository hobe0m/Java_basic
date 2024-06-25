package ref;

public class NullMain1 {
    // Null
    // 참조형 변수에는 항상 객체가 있는 위치를 가르키는 참조값이 들어간다.
    // 그런데 아직 가리키는 대상이 없거나, 가리키는 대상을 나중에 입력하고 싶을 때는 null이라는 값을 넣어둘 수 있다.
    // null은 값이 존재하지 않는, 없다는 뜻이다.
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data : " + data); // 참조값이 null이므로 null 출력

        data = new Data();
        System.out.println("2. data : " + data); // 참조값이 있으므로 참조값 출력
        
        data = null;
        System.out.println("3. data : " + data); // 참조값이 null이므로 null 출력

        // GC(Garbage Collection) : 가비지 컬렉션, 아무도 참조하지 않는 인스턴스는 더 이상 사용하지 않는 인스턴스라고 판단하고 JVM이 GC를 사용해 자동으로 메모리에서 제거한다.
    }
}

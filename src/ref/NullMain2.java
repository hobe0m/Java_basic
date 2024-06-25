package ref;

public class NullMain2 {
    // NullPointerException : 참조값 없이 객체를 찾아갈 때 발생하는 오류
    // null을 가르키는 것(Pointer)이 없을 때 발생하는 예외(Exception)
    public static void main(String[] args) {
        Data data = null;
        // data.value = 10; NullPointerException 발생, 참조할 주소가 존재하지 않기 때문이다.
        // NullPointerException이 발생하면 아래의 코드를 실행하지 않고 빠져나간다.
        System.out.println("data : " + data.value);

        // 지역변수가 null일 때는 파악하기 쉽지만, 멤버변수(클래스)가 null일 때는 파악하기 어렵다.
    }
}

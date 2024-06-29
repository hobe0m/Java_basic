package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        // shift + F6 : 한번에 지정 문자 및 문자열 바꾸기
        PublicClass publicClass = new PublicClass(); // public 클래스는 가져다 쓸 수 있다.
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 같은 패키지 안에 있으므로 가져다 쓸 수 있다.
        DefaultClass2 defaultClass2 = new DefaultClass2(); // 같은 패키지 안에 있으므로 가져다 쓸 수 있다.
    }
}

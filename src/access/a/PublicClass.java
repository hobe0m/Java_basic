package access.a;

public class PublicClass {
    // 클래스 레벨의 접근 제어자는 public, default만 사용할 수 있다.
    //  - private, protected는 사용할 수 없음
    // public 클래스는 반드시 파일명과 이름이 같이야 한다(자동 생성).
    //  - 파일명과 클래스명이 다르면 컴파일 오류 발생(자바의 규칙)
    // 하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
    // 하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.
    // 하나의 자바 파일 안에는 여러 개의 클래스를 만들 수 있다.
    //  - 파일명과 이름이 같은 public 클래스는 하나만 만들 수 있고, 파일명과 이름이 달라도 되는 default 클래스는 무한정 만들 수 있다.

    public static void main(String[] args) {
        // 클래스도 객체로 생성해서 사용 가능하다.

        PublicClass publicClass = new PublicClass(); // 자기 자신의 클래스를 생성해서 사용
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

// 같은 패키지(access.a) 안에서는 가져다 쓸 수 있다.
class DefaultClass1 {

}

// 같은 패키지(access.a) 안에서는 가져다 쓸 수 있다.
class DefaultClass2 {

}
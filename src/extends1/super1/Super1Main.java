package extends1.super1;

public class Super1Main {
    public static void main(String[] args) {

        Child child = new Child();

        child.call();
    }
    // this는 자기 자신을 참조, 생략 가능
    // super는 부모 클래스 참조를 뜻한다.
    // 필드 이름과 메서드 이름이 같아도 super를 사용해서 부모 클래스에 있는 기능을 사용할 수 있다.
}

package pack.a;
// pack 패키지의 내부, a 패키지
public class User {

    // 생성자에 public을 사용하는 것은 다른 패키지에서 이 클래스의 생성자를 호출하게 하기 위함이다.
    public User() {
        System.out.println("패키지 pack.a에 회원 생성");
    }
}

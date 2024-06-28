package pack.b;

public class User {
    // 패키지 덕분에 클래스 이름이 같아도 패키지 이름으로 구분해서 같은 이름의 클래스를 사용할 수 있다.
    // 즉, 경로를 찾을 때는 패키지를 포함한 전체 경로를 파악해서 찾아간다고 보면 된다.
    //

    public User() {
        System.out.println("패키지 pack.b에 회원 생성");
    }
}

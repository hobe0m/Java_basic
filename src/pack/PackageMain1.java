package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지에 있는 경우 불러다 쓰면 된다.

        pack.a.User user = new pack.a.User(); // 다른 패키지에 있는 경우 패키지명 + 클래스명으로 적어줘야 한다.
    }
}

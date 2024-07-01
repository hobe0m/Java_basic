package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        // static이 붙은 건 모두 클래스 소속이라고 생각하면 된다.
        // 클래스에 직접 접근해서 사용해야 한다.

        System.out.println("before : " + s);
        System.out.println("after : " + deco);

        // static이 붙은 정적 메서드는 객체 생성 없이 클래스명 + .(dot) + 메서드명으로 바로 호출할 수 있다.
        // 정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드를 사용한 것이다.

        // 클래스 메서드
        // 메서드 앞에 static이 붙으면 정적 메서드 또는 클래스 메서드라고 한다.
        // static이 정적이라는 뜻이며, 인스턴스 생성 없이 마치 클래스에 있는 메서드를 바로 호출하는 것처럼 느껴지기 때문이다.
        // 인스턴스의 필드가 필요 없고(객체 생성 필요 X), 단지 기능만 사용하고 싶은 경우 정적 메서드를 사용한다.


        // 인스턴스 메서드
        // static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있으므로 인스턴스 메서드라 한다.
    }
}

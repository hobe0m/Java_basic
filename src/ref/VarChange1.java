package ref;

public class VarChange1 {
    // 참조형의 경우 실제 사용하는 갳게가 아니라 객체를 가르키는 참조값만 복사된다.
    // 즉, 건물이 복사가 되는 것이 아니라 건물의 위치인 주소만 복사되는 것이다.
    // 따라서 같은 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐이다.
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = : " + a);
        System.out.println("b = : " + b);

        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = : " + a);
        System.out.println("b = : " + b);

        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = : " + a);
        System.out.println("b = : " + b);
    }
}

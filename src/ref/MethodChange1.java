package ref;
public class MethodChange1 {
    // 기본형과 메서드 호출
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a); // 10
        changePrimitive(a); // a는 x에 복사해서 대입만 할 뿐 기존 값이 변하진 않는다.
        System.out.println("메서드 호출 후 : a = " + a); // 10
        // a와 x라는 변수가 따로 존재하는 것이다.
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}

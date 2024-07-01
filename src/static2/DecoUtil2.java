package static2;

public class DecoUtil2 {
    
    // 메서드에 static 붙여 사용하기
    // static을 붙이면 정적 메서드가 되는데, 정적 메서드는 정적 변수처럼 인스턴스의 생성 없이 클래스 명을 통해서 바로 호출될 수 있다.
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}

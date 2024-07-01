package static2;

public class DecoUtil1 {
    // static 메서드

    // 문자열 앞에 *을 붙여 꾸며주는 메서드 만들기
    public String deco(String str) {
        String result = "*" + str + "*";
        return result;

        // return "*" + str + "*" 이런 식으로 사용해도 된다.
    }
}

package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    // 안되는 코드라도 머리로만 이해하고 넘어가지 말고 실제로 한번 쳐보는 것이 좋다.
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지이므로 default(package-private) 클래스에는 접근이 불가하다.
        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

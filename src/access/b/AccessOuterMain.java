package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지, default 호출 가능
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
        // innerAccess가 public이라 접근 가능
        // 내부에서는 본인이 가진 모든 필드나 메서드에 접근 가능(private도 가능하다.)
        // 또한 private도 innerAccess가 AccessData에 포함되어 있으므로 접근 가능하다.
        // AccessData.innerAccess() 메서드는 public이기에 외부에서 호출 가능하고 innerAccess() 메서드는 외부에서 호출되었지만 해당 메서드 안에서는 자신의 private 필드와 메서드에 접근할 수 있다.
        // 생성자도 접근 제어자 관점에서 메서드와 같다.
    }
}

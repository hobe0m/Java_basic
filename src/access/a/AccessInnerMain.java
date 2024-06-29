package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지, default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess(); 
        // innerAccess가 public이라 접근 가능
        // 내부에서는 본인이 가진 모든 필드나 메서드에 접근 가능(private도 가능하다.)
        // 또한 private도 innerAccess가 AccessData에 포함되어 있으므로 접근 가능하다.
    }
}

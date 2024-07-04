package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA(); // child에서 오버라이딩 한 결과가 나온다.
        a.methodCommon(); // child에서 오버라이딩 한 결과가 나온다.

        InterfaceB b = new Child();
        b.methodB(); // child에서 오버라이딩 한 결과가 나온다.
        b.methodCommon(); // child에서 오버라이딩 한 결과가 나온다.

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }
}

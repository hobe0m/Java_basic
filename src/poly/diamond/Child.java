package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    // sout + m : 클래스와 메서드명 출력
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // methodCommon은 동일한 메서드가 두 개이기 때문에 하나만 구현하면 된다.
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }


}

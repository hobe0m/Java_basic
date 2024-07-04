package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    // 상속(extends)은 하나만 구현(implements)은 무한대이므로 extends가 먼저 등장해야 한다.
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 날고 있습니다.");
    }
}

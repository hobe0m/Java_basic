package poly.ex3;

public class Dog extends AbstractAnimal {
    // ctrl + o : 메서드 오버라이딩 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

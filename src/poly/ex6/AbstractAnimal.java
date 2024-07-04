package poly.ex6;

public abstract class AbstractAnimal {
    // 클래스와 인터페이스 활용
    // 상속과 구현을 동시에 사용
    public abstract void sound();
    public void move() {
        System.out.println("동물이 이동합니다.");
    };
}


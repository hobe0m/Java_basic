package extends1.ex3;

public class HydrogenCar extends Car{

    // Car를 상속받기 때문에 이동 및 문열기 기능은 추가하지 않아도 된다.
    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }
}

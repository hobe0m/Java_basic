package extends1.ex1;

public class CarMain {
    // 상속의 필요성
    // 전기차든 가솔린차든 주유하는 방식만 다르지 이동하는 것은 똑같은데 이런 경우 상속 관계를 사용하는 것이 효과적이다.
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}

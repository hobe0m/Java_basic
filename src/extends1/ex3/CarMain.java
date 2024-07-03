package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();

        // 상속 관계를 사용해서 새로운 수소차를 편리하게 확장(extend)한 것을 볼 수 있다.
        // 수소 차에는 수소차만의 기능만 넣고, 차라는 부모 클래스에 차가 가질 공통 기능을 추가해주면 된다.
    }
}

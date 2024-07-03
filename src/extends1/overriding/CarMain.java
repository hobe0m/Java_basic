package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        // electicCar의 타입으로 호출하므로 ElectricCar를 먼저 찾아서 메서드를 찾는다.
        // ElectricCar에 오버라이딩 된 move()가 있으므로 그 메서드를 사용한다.

        GasCar gasCar = new GasCar();
        gasCar.move();
        // GasCar에 move() 메서드가 없으므로 부모 타입인 Car 클래스로 이동해서 move()를 찾는다.

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
    }
}

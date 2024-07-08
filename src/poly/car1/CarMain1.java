package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        // 운전자 생성
        Driver driver = new Driver();

        // 차량 선택(K3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(K3 -> Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(Model3 -> NewCar)
        // 이 때, Driver 클래스의 코드 변경 없이 새로운 기능을 확장했다.
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}

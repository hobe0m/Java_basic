package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car(); // 차량 구매

        driver.setK3Car(k3Car); // 운전자가 K3 자동차의 인스턴스를 가지게 되면서 사용 가능(참조값을 넘김)
        driver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // K3Car는 null로 바꿔주고 다음에 model3Car를 넣어줘야 한다.
        driver.setModel3Car(model3Car);
        driver.drive();
    }
    // k3를 운전하던 운전다가 Model3로 차량을 변경해서 운전하는 코드
    // 기존 참조 제거 후 새로운 참조 값을 넣어준다.
    // 그 다음 자동차를 운전한다.

    // 여기서 새로운 차량을 추가해야 한다면 또 다시 Driver 코드를 많이 변경해야 한다.
    // 만약 운전할 수 있는 차량의 종류가 계속 늘어난다면 점점 더 변경해야 하는 코드가 많아질 것이다.
    // 역할과 구현을 분리하지 않았기 때문이다.
}

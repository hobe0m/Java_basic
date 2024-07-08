package poly.car0;

public class Driver {
    
    // 운전자의 필드
    private K3Car k3Car;
    // 초기화가 안됐으므로 기본 값은 null이다.
    // 운전자만 생성하면 아직 자동차를 가지고 있지 않으므로 초기화 X
    // 운전자가 K3 자동차를 알고 있다라고 생각하면 된다.

    // 추가
    private Model3Car model3Car;

    // 자동차를 구매하면 setK3Car 메서드가 실행되어 자동차가 생긴다.
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // 추가
    // 자동차를 구매하면 setModel3Car 메서드가 실행되어 자동차가 생긴다.
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}

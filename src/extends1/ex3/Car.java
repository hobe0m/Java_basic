package extends1.ex3;

public class Car {
   // 상속의 기능 추가
   public void move() {
        System.out.println("차를 이동합니다.");
    }

    // 문열기 기능 추가
    // 모든 차량에 문열기 기능을 추가할 때는 상위 부모인 Car()에 openDoor() 기능을 추가하면 된다.
    // 이렇게 하면 Car의 자식들은 모두 문열기 기능을 물려 받는다.
    // 만약 상속 관계가 아니었다면 각각의 차량에 해당 기능을 모두 추가해야 한다.
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}

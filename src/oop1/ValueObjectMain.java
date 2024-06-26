package oop1;

public class ValueObjectMain {
    // 클래스와 메서드
    // 클래스는 데이터인 멤버 변수 뿐 아니라 기능 역할을 하는 메서드도 포함할 수 있다.
    // 자바와 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
    public static void main(String[] args) {
        
        ValueData valueData = new ValueData(); // 객체(인스턴스) 생성, 필드와 메서드 둘 다 사용 가능(객체 내부에 데이터와 기능 둘 다 있기 때문에)
        
        // 기능(메서드) 사용
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 : " + valueData.value);

        // 인스턴스의 메서드를 사용하는 방법은 멤버 변수를 사용하는 방법과 동일하다.
        // .(dot)을 찍어서 객체에 접근한 뒤에 원하는 메서드를 호출하면 된다.
        // 이 때, 객체의 메서드 내에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.
        //  - add가 사용하는 데이터(멤버 변수는 valueData의 value인 것)
        
        // 속성과 기능을 하나로 묶어놓고 사용하는 것 = 객체 지향 프로그래밍
    }
}
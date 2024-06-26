package oop1;

public class ValueDataMain {
    // 클래스와 메서드
    // 클래스는 데이터인 멤버 변수 뿐 아니라 기능 역할을 하는 메서드도 포함할 수 있다.
    // 자바와 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있다.
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자 : " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value : " + valueData.value);
    }
}

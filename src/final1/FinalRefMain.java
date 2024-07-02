package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // data라는 참조형 변수를 final로 선언했다.
        // Data data = new Data(); 따라서 data라는 변수의 참조값을 바꿀 수 없다.
        //  - data라는 이름에 새로운 참조값을 부여할 수 없다(새로운 객체 생성 X).

        // 그러나 참조 대상의 값은 변경 가능하다.
        // 참조값(참조하는 객체)만 바꾸지 못할 뿐 내부의 값은 변경할 수 있다.
        // 즉, data.value는 final이 아니므로 값을 변경할 수 있다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

        // 참조형 변수에 final이 붙으면 참조 대상 자체를 다른 대상으로 변경하지 못하는 것이지, 참조하는 대상의 값을 변경하지 못하는 것은 아니다.
    }
}

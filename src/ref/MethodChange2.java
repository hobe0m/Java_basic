package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // 10
        System.out.println("dataA = " + dataA); // 참조값이 동일한 지 확인
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);
        // 참조값을 복사하기 때문에 동일 객체를 변경하는 것이다.
        // 따라서 20이 출력된다.
    }

    public static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX); // 참조값이 동일한 지 확인
        dataX.value = 20;
    }

    // 기본형과 참조형의 메서드 호출
    // 자바에서 메서드의 매개변수(파라미터)는 항상 값(기본형, 참조형)에 의해 전달된다.
    //  - 그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다.
    //  - 기본형 : 메서드로 기본형 데이터를 전달하면 해당 값이 복사되어 전달되므로 메서드 내부에서 매개변수(파라미터)의 값을 변경해도 호출자의 변수 값에는 영향이 없다.
    //  - 참조형 : 메서드로 참조형 데이터를 전달하면 참조 값이 복사되어 전달되므로 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.
}

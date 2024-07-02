package final1;

public class FieldInit {

    // 관례적으로 멤버 변수에 static final이 붙으면 변수 이름을 대문자로 사용하고, 상수라고 칭한다.
    static final int CONST_VALUE = 10;
    final int value = 10;

    // public FieldInit(int value) {
        // this.value = value; 초기 값을 넣어버린 경우에는 생성자를 통해서 값을 다시 할당할 수 없다.
    // }
}

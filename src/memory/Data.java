package memory;

public class Data {
    // 스택 영역과 힙 영역
    // 스택 영역과 힙 영역이 함께 사용되는 경우

    private int value;

    public Data(int value) {
        this.value = value;
    }

    // getValue만 쳐서 자동으로 메서드를 만들 수 있다(자동 생성).
    public int getValue() {
        return value;
    }
}

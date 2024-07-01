package static1;

public class Data1 {
    // Static 키워드
    // static 키워드는 주로 멤버 변수와 메서드에 사용된다.
    // 멤버 변수에 static이 필요한 이유
    
    // 인스턴스 내부 변수에 카운트 저장
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }
}

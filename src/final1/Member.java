package final1;

public class Member {
    private final String id; // final 키워드 사용, 따라서 선언 시 혹은 생성자를 통해 초기화를 반드시 해주어야 한다.
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        // this.id = id; final이므로 변경 불가
        this.name = name;
    }

    public void print() {
        System.out.println("id : " + id + " name : " + name);
    }

    // final을 사용했기 때문에 id를 변경하려고 하면 컴파일 오류가 발생한다.
}

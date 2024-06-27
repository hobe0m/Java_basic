package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        // 이 때, 회원 객체를 생성하면 객체의 변수에 초기값을 설정해야 한다.
        // 제대로 사용하기 위해서는 객체 생성 후 초기값을 설정해야 하기 때문이다.
        // 지금 이 코드에서는 초기값 설정이 반복된다.
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }

}

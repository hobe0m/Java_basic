package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        // 메서드를 통한 초기값 설정
        MemberInit member1 = new MemberInit();
        // MemberInit으로 member1 객체를 만든다.
        member1.initMember("user1", 15, 90);
        // member1이라는 객체에 MemberInit의 initMember 메서드를 사용하여 초기값을 설정한다.

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
}

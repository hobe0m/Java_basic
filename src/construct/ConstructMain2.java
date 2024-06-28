package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        // 생성자 오버로딩 검증
        
        // ctrl + p : 필요한 파라미터(매개변수)가 무엇인 지 알려주는 단축키
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
        }
    }
}
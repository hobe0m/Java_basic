package construct;

import java.lang.reflect.Member;

public class MethodInitMain2 {
    public static void main(String[] args) {
        // 메서드를 통한 초기값 설정
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        // 초기값을 설정할 때 어디에 초기값을 설정할 지 객체를 넣어주어야 한다.
        // member를 통해 참조값을 넘기고 name, age, grade를 받아서 인스턴스에 넣어준다.
        member.name = name;
        member.age = age;
        member.grade = grade;
    }

    // initMember 메서드로 반복을 제거했지만, 이 메서드는 대부분 Member 객체의 멤버 변수를 사용한다.
    // 이런 경우 속성과 기능을 한 곳에 두는 것이 더 나은 방법이다.
    // 쉽게 애기해서 MemberInit이 자기 자신의 데이터를 변경하는 기능(메서드)를 제공하는 것이 좋다.
}

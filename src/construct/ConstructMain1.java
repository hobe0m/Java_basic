package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // ctrl + p : 필요한 파라미터(매개변수)가 무엇인 지 알려주는 단축키
        // 생성자를 통해 객체를 만드려고 할 때는 정의했던 매개변수에 인자들을 넣어주어야 한다.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 성적 : " + member.grade);
        }
    }

    // 생성자 호출
    // 생성자는 인스턴스를 생성하고 나서 즉시 호출된다.
    // 생성자를 호출하는 방법은 new + 생성자 이름(매개 변수)이다.
    //  - new 생성자 이름(생성자에 맞는 인수 목록)
    //  - new 클래스 이름(생성자에 맞는 이수 목록)
    //   - 생성자는 클래스와 이름이 동일하기 때문에 둘 다 맞는 표현이다.
    // 참고로 new 키워드를 사용해서 객체를 생성할 때 마지막에 괄호를 포함해야 하는 이유가 바로 생성자 때문이다.
    // 객체를 생성하고 동시에 생성자를 호출한다는 의미를 내포한다.

    // 생성자 장점
    // 중복 호출 제거, 생성자가 없던 시절에는 생성 직후에 어떤 작업을 수행하기 위해 메서드를 직접 호출해야 했지만 생성자를 사용하면 생성과 생성 직후 필요한 작업을 한번에 할 수 있게 되었다.

    // 메서드 사용 시
    // MemberInit member = new MemberInit();
    // member.initMember("user01", 15, 90);

    // 생성자 사용 시
    // MemberConstruct member = new MemberConstruct("user01", 15, 90);

    // 제약
    // 메서드 사용 시, 메서드 호출부(member.initMember("user01", 15, 90))를 깜박하고 적지 않더라도 프로그램은 실행된다.
    // 문법적으로 문제가 없기 때문이다.
    // 다만 회원(객체)의 이름과 나이 그리고 성적 데이터가 없는 상태로 프로그램이 동작한다.
    // 생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 반드시 호출해야 한다는 것이다.
    // 참고로 메서드 오버로딩처럼 생성자를 여러 개 정의할 수 있는데, 이 경우에는 하나만 호출하면 된다.
    // 호출하지 않으면 컴파일 오류가 발생한다.
    // 따라서 필수 값은 생성자로 받고, 보조적인 건 다른 방법(메서드...)을 통해 따로 받는 경우가 많다.
    // 생성자를 사용하면 필수값 입력을 보장할 수 있다.
}
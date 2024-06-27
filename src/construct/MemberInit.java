package construct;

// 생성자
// 객체를 생성하는 시점에 어떠한 작업을 하고 싶으면 생성자를 이용하면 된다.
// 생성자를 알아보기 전에 생성자가 필요한 이유를 확인해 보자
public class MemberInit {
    String name;
    int age;
    int grade;

    // 멤버변수의 있는 값을 매개변수에 넣어주려고 할 때 이름이 동일하면 헷갈리므로 this를 사용해 이 멤버 변수의 값에 대입하겠다는 것을 명시
    // 멤버 변수와 메서드의 매개 변수의 이름이 같을 때 
    //  - 이름이 동일할 경우 본인한테서 가까운 scope부터 탐색해 찾아 넣기 때문에 다 매개변수의 값이 들어가므로 this를 통해 자기 자신의 인스턴스를 가르키게 한다.
    // 즉 매개변수 String name, int age, int grade를 생성된 객체에 넣겠다는 의미로 사용하기 위해 처음의 name, age, grade 앞에는 생성된 객체(인스턴스)의 참조값을 가리키는 this를 넣어준다.
    // 또한 객체 지향 프로그래밍이므로 매개변수의 객체 생성 부분(MemberInit member)도 빼준다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        // Member에 초기값 설정 기능을 제공하는 메서드
        // 따라서 메서드를 호출하면 객체의 멤버 변수에 인자로 넘어온 값을 채운다.
        // member1.initMember("user1", 15, 90);
        
        // this : 자기 자신의 인스턴스 참조
        // 따라서 매개 변수와 멤버 변수의 이름이 같을 때는 this를 통해 확실히 구별해주어야 한다.
    }
}

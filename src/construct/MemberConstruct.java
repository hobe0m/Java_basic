package construct;

public class MemberConstruct {
    // 생성자 - 도입
    // 프로그래밍을 하다보면 객체를 생성하고 이후에 바로 초기값을 할당해야 하는 경우가 많다.
    // 따라서 앞서 만든 initMember()와 같은 메서드를 매번 만들어야 한다.
    // 그렇기에 대부분의 객체 지향 언어는 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 생성자라는 기능을 제공한다.
    // 생성자를 사용하면 객체를 생성하는 시점에 즉시 필요한 기능을 수행할 수 있다.
    // 생성자는 앞서 살펴본 initMember(0와 같이 메서드와 유사하지만 몇가지 다른 특징이 있다.
    
    String name;
    int age;
    int grade;
    
    // 생성자 생성
    // 생성자의 이름은 클래스 이름과 같고, 첫 글자도 대문자로 시작한다.
    // 생성자는 반환 타입이 없어 비워두어야 한다.
    // 나머지는 메서드와 같다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name : " + name + ", age : " + age + ", grade : " + grade);
        this.name = name; // this를 사용하는 이유는 지역 변수(매개 변수)가 아닌 MemberConstruct의 멤버 변수를 사용하기 위함이다.
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩(이름은 동일, 매개 변수가 다른 경우)
    // 생성자가 여러 개일때는 그 중에서 하나만 호출해도 된다.
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        // 이 클래스의 생성자를 호출(생성자 안에서만 사용 가능)
        // MemberConstruct의 생성자를 호출해 중복 제거
        // this : 자기 자신의 참조값 참조
        // this() : 생성자 내부에서 다른 생성자 호출

        // this()의 규칙
        // 생성자 코드 안에서 첫 줄에만 작성할 수 있다.
    }
}

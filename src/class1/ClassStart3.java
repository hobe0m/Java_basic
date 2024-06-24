package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        // 학생 클래스 사용

        Student student1; // 학생을 담는 변수 선언
        student1 = new Student(); // 학생(이름, 나이, 성적)을 실제 메모리에 담는다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // Student student2;, student2 = new Student(); 합쳐서 사용
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // 참조값(@ 이후)
        System.out.println(student2); // 참조값(@ 이후)

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);


    }

    // 타입은 데이터의 종류나 형태를 나타낸다.
    // 그러면 Student(학생)이라는 타입을 만들면 안될까?
    //  - 클래스를 사용하여 int, String과 같은 타입을 직접 만들 수 있다.
    //  - 다만 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 클래스라는 설계도가 무조건 필요하다.
    //  - 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
    //   - 여기서 만든 학생1과 학생2
    // 종합하면 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
    //  - 여기서는 Student 설계도를 통해 student1, student2라는 객체(인스턴스)를 만들어냈다.
    //  - 붕어빵 틀과 붕어빵으로 생각하면 된다.
    //  - 객체, 인스턴스는 new + 설계도 클래스();를 통해 만든다.
    //   - Student student1 = new student();

    // Student student1 : Student 타입을 받을 수 있는 변수를 선언
    // student1 = new Student : Student 클래스 정보를 기반으로 새로운(new) 객체 생성 후 student1에 담는다.
    // 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값을 반환(변수에 담는다)한다.
    // 참조값을 변수에 보관하는 이유 : new Student는 아무런 이름이 없고, 단순히 메모리에 실체 객체를 만들기만 하므로 접근할 수 있는 방법이 필요함 따라서 변수에 저장해서 접근

    // 객체 사용
    // 객체를 사용하려면 객체에 접근해야 하는데 접근은 dot(.)을 통해서 한다.
    // (dot).을 통해 참조값을 통해 실제 객체에 접근 후 정보를 가져오는 것
    //  - student1.name, student1.age...
    //  - 이 때 클래스에 정의되어 있는 정보(객체가 가진 정보)에 한해서만 접근할 수 있다.

    // 클래스, 객체, 인스턴스 정리
    // 클래스 : 객체를 생성하기 위한 틀 또는 설계도
    //  - 객체가 가져야 할 속성(변수)와 기능(메서드)를 정의한다.
    //  - 메서드는 뒤에서 설명하고 학생은 name, age, grade라는 속성을 가진다.
    //  - 붕어빵을 만드는 틀, 자동차의 설계도 => 실제 존재하는 것이 아닌 개념으로만 존재

    // 객체와 인스턴스의 차이
    //  - 객체는 클래스에서 정의한 속성과 기능을 가진 실체, 객체는 서로 독립적인 상태를 가진다.
    //  - student1과 student2는 같은 클래스에서 만들어지지만, 서로 다른 객체이다.
    //  - 인스턴스는 주로 객체가 어떤 클래스에 속해있는지 강조할 때 사용한다.
    //   - student1은 Student 클래스의 인스턴스, 객체보다 관계에 좀 더 초점을 맞춘 단어이다.
}

package ref;

public class Method2 {
    // 참조형과 메서드 호출의 활용
    public static void main(String[] args) {

        // 메서드에서 student 타입으로 반환하기 때문에 Student형태의 student1,2로 받아준다.
        Student student1 = createStudent("학생1", 15, 90); // 반환값을 student1에 담는다.
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 16, 80); // 반환값을 student2에 담는다.
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    // 학생을 만드는 메서드
    // student를 반환하므로 사용 시 Student 형태의 변수로 받아주어야 한다.
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    // 객체 생성과 초기화하는 부분을 모두 담았다.
    // 그러나 메서드 안에서 객체를 생성했기에 만들어진 객체를 메서드 밖에서 사용할 수 있게 반환(return)해주어야 한다.
    // 참조값을 메서드 외부로 반환한 것
    // 따라서 반환된 값을 메서드 호출 시 같은 타입의 변수에 담아 사용하면 된다.
    
    // 전달한 학생 객체의 필드 값을 읽고 출력
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}

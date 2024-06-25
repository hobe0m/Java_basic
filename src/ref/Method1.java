package ref;

public class Method1 {
    // 참조형과 메서드 호출의 활용
    public static void main(String[] args) {
        Student student1 = new Student(); // 동일한 패키지 내에 있는 클래스 사용해야 한다.
        initStudent(student1, "학생1", 15, 90);

        // shift + F6 : 동일한 코드를 동시에 다 변경할 수 있는 단축키
        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    // 전달한 학생 객체의 필드에 값을 설정
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    
    // 전달한 학생 객체의 필드 값을 읽고 출력
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}

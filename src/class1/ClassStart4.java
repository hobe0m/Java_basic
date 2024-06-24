package class1;
public class ClassStart4 {
    public static void main(String[] args) {
        // 배열 도입

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

        Student[] students = new Student[2]; // Student 인스턴스의 참조값을 2개 보관할 수 있는 배열 생성
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

        // 자바에서의 대입은 변수에 들어있는 값을 읽고 복사해서 대입하는 것이다.
        // 따라서 참조값이 배열에 저장된다.
        // 배열의 인덱스를 통해 객체에 접근할 수도, 객체에 직접 접근할 수도 있다.
    }
}

package class1;
public class ClassStart5 {
    public static void main(String[] args) {
        // 배열을 이용한 코드 리팩토링

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student[] students = new Student[] {student1, student2};
        Student[] students = {student1, student2}; // 배열 최적화

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }

        /*
        이런 식으로 선언해놓고 축약해서 사용할 수도 있다.
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
        */

        /*
        향상된 for문 : 위의 과정을 해주는 것
        iter : 향상된 for문을 자동으로 만들어주는 단축키

        for (Student s : students) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        */


    }
}

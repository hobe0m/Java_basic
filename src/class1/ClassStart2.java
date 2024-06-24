package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 배열 도입
        // 배열 : 같은 데이터 타입을 하나로 묶는 것

        String[] students = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentsAge = {15, 16, 17, 20};
        int[] studentsGrade = {90, 80, 70, 60};

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번째 학생의 이름은 " + students[i] + ", 나이는 " + studentsAge[i] + ", 성적은 " + studentsGrade[i] + "입니다.");
        }
    }
        // 배열 사용의 한계
        //  - 한 학생의 데이터가 3개의 배열에 나누어져 있기 때문에 3개의 배열을 각각 변경해야 하고, 인덱스 순서를 정확하게 맞추어야 한다.
        //  - 따라서 관리하기 좋은 방식은 아니다(컴퓨터가 관리하기 좋은 방식).

        // 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶고, 각각의 학생별로 본인의 이름, 나이, 성적을 관리하는 것이다.
}

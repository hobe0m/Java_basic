package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USERS);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }
    // 매직 넘버 : 코드에서 의미를 알 수 없는 숫자
    //  - 매직 넘버 문제를 해결하기 위해 상수를 사용하면 된다.
    //  - 숫자 1000이 아니라 MAX_USERS라는 변수명을 사용하므로 이해가 쉬워진다.
    //  - 또한 코드 변경 소요가 있을 시 상수 하나만 바꾸면 되므로 용이해진다.
    //   - 다만, 이 때 프로그램을 종료 후 변경해야 한다.

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}

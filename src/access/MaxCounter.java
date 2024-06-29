package access;

public class MaxCounter {
    private int count = 0;
    private int max;

    // 생성자를 통해 MaxCounter 객체 생성 시 Max값을 3으로 지정한다.
    MaxCounter() {
        max = 3;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public void getCount() {
        System.out.println("현재 값은 " + count + "입니다.");
    }

    /*
    public int getCount() {
        return count;
    }
    */
}

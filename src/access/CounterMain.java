package access;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.getCount();
        /*
        메서드에서 값을 불러서 출력하지 않고, 사용하는 클래스에서 메서드를 호출해 변수에 넣고 출력하는 방법도 있다.

        int count = counter.getCount();
        System.out.println(count);
        */
    }
}

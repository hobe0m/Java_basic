package static1;

public class DataCountMain2 {
    public static void main(String[] args) {

        // 하나의 인스턴스의 변수 값을 공유해서 사용하기 때문에 count의 값이 1씩 증가한다.
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count : " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count : " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count : " + counter.count);

        // 결과는 원하는 결과지만 약간 불편한 점들이 있다.
        // Data2 클래스와 관련된 일인데, Counter라는 별도의 클래스를 추가로 사용해야 한다.
        // 생성자의 매개변수도 추가되고, 생성자가 복잡해진다.
        // 또한 생성자를 호출하는 부분도 복잡해진다.
    }
}

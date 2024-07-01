package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        // 새로운 객체(인스턴스)가 만들어지기 때문에 count의 수가 증가하지 않는다.
        //  - count 변수도 새로 만들어지기 때문에 모두 1로 출력된다.
        //  - 이 문제를 해결하려면, 변수를 서로 공유해야 한다.

        Data1 data1 = new Data1("A");
        System.out.println("A count : " + data1.count);

        Data1 data2 = new Data1("b");
        System.out.println("B count : " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count : " + data3.count);
    }
}

package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count : " + bigData.count); // 0
        System.out.println("bigData.data : " + bigData.data); // null

        System.out.println("bigData.data.value : " + bigData.data.value); // bigData.data에 새로운 객체를 넣었으므로 새로운 객체 data의 value값, 다만 초기화가 되지 않은 상태이므로 0 출력
    }
}

package static1;

public class DataCountMain3 {
    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count : " + Data3.count);
        // data1.count가 아니고 data3.count인 이유
        //  - 정적 변수에 접근하는 방식은 클래스명 + .(dot) + 변수이다.
        //  - 마치 클래스에 직접 접근하는 것처럼 느껴진다.

        // static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
        //  - 따라서 static이 붙은 멤버 변수 count는 인스턴스 영역에 생성되지 않고, 메서드 영역에서 이 변수를 관리한다.
        //  - Data3("A") 인스턴스를 생성하면 생성자가 호출된다.
        //  - 생성자에는 count++라는 코드가 있고 count는 static이 붙은 정적변수이다.
        //  - 정적 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리하므로 따라서 이 경우에는 메서드 영역에 있는 count의 값이 하나 증가된다.

        // 쉽게 말해서 객체가 위치하는 힙 영역이 아니라 클래스 정보가 있는 메서드 영역에 위치하므로 클래스에 접근해야 한다.

        Data3 data2 = new Data3("B");
        System.out.println("B count : " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count : " + Data3.count);

        // static 변수는 쉽게 이야기 해서 클래스인 붕어빵 틀이 특별이 관리하는 변수이다.
        // 붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재하고 반면에 인스턴스인 붕어빵은 인스턴스의 수만큼 변수가 존재한다.

        // 인스턴스를 통한 정적 변수의 접근
        // 인스턴스에 접근해도, 실제로는 인스턴스에 갔다가 static인 것을 알고 클래스에 있는 스택 영역의 변수를 사용한다.
        // 둘 다 똑같지만, 인스턴스를 통한 접근은 권장하지 않는다.
        // 해당 변수가 인스턴스 변수인 지 정적 변수인 지 확인할 수 없기 때문이다.
        // 따라서 정적 변수임을 확실하게 하기 위해서 클래스를 통한 접근 방법을 쓰는 것이 좋다.
        Data3 data4 = new Data3("D");
        System.out.println(Data3.count);

        Data3 data5 = new Data3("E");
        System.out.println(Data3.count);
        // 인텔리제이에서 노란줄을 띄우는 것은 별로 좋지 않은 것임을 알려주는 것이다.
        // alt + enter를 통해 새로운 방법을 모색한다.

        // 클래스를 통한 정적 변수의 접근
        System.out.println(Data3.count);
    }
}

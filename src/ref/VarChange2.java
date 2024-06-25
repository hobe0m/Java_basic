package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 = " + dataA); // 참조값 주소(동일)
        System.out.println("dataB 참조값 = " + dataB); // 참조값 주소(동일)
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20

        // dataB 변경
        // 둘 다 같은 인스턴스에 접근하고 있으므로, 둘 중 하나만 바뀌어도 둘 다 바뀐다.
        // dataA.value, dataB.value를 변경해도 하나의 인스턴스를 변경하는 것이다.
        // 즉, 같은 객체 인스턴스를 참조하므로 값은 항상 같다.
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30
    }
}

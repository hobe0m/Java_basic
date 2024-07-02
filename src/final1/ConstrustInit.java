package final1;

public class ConstrustInit {

    final int value;

    // 멤버 변수에 final이 붙은 경우 생성자를 통해 초기화를 해줘야 하고 이후에는 다른 값을 넣을 수 없다.
    public ConstrustInit(int value) {
        this.value = value;
    }
}

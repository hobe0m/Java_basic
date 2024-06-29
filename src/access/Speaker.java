package access;
public class Speaker {
    // 접근 제어자
    // 접근 제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다.
    // 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.

    // 이 Speaker(클래스)안에서만 volume에 접근할 수 있다.
    private int volume;

    // 생성자, 객체 생성 시 초기 볼륨 설정
    Speaker(int volume) {
        this.volume = volume;
    }

    // 볼륨이 100을 넘게 되면 음량 증가 X
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }

    // 접근 제어자의 종류(4가지)
    // private : 모든 외부 호출을 막는다.
    // default(package-private) : 같은 패키지 안에서 호출은 허용한다.
    //  - 아무것도 안적을 경우 default
    // protected : 같은 패키지 안에서 호출은 허용하고, 패키지가 달라도 상속관계의 호출은 허용한다.
    // public : 모든 외부 호출을 허용한다.

    // private -> default(package-private) -> protected -> public
    // 순서대로 private가 가장 많이 차단하고, public이 가장 많이 허용한다.
    // protected는 상속 관계에서 자세히 설명한다.

    // package-private : 접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 default 접근 제어자가 적용된다.
    // default는 해당 접근 제어자가 기본값으로 사용되기 때문에 붙여진 이름이므로 package-private가 더 정확한 이름이다.

    // 접근 제어자 사용 위치
    //  - 필드와 메서드, 생성자에 사용된다.
    //  - 추가로 클래스 레벨에도 일부 접근 제어자를 사용할 수 있는데, 이 부분은 뒤에서 설명한다.

    // 지역 변수에는 사용 불가, 어차피 그 지역 안에서만 접근할 수 있기 때문이다.
}

package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        // 절차 지향 프로그래밍 - 메서드 추출
        // 잘 만든 절차 지향 프로그램의 예시

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태 확인
        showStatus(data);

        // 음악 플레이어 종료
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어의 상태 확인");
        if (data.isOn = true) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    // 각각의 기능을 메서드로 만든 덕분에 각각의 기능이 모듈화가 되었다.
    // 따라서 중복 제거, 변경 영향 범위 제한, 메서드 이름 추가(호출 용이) 등의 장점이 생겼다.
    // 모듈화 : 쉽게 이야기 해서 레고 블럭이다.
    //  - 필요한 블럭을 가져다 꼽아서 사용할 수 있고, 여기서는 음악 플레이어의 기능이 필요한 경우 해당 기능을 메서드 호출(블럭 가져오기)만으로 쉽게 사용할 수 있다.
    //  - 따라서 이제 음악 플레이어와 관련된 메서드를 조립해서 프로그램을 작성할 수 있다.

    // 절차 지향 프로그래밍의 단점, 객체 지향 프로그래밍을 사용하는 이유
    //  - 지금보다 더 개선할 수 있음(한계점이 존재하기 때문에)
    //   - 한계점
    //    - 데이터와 기능이 분리되어 있음
    //    - 그래서 데이터는 MusicPlayerData를 기능은 MusicPlayerMain3의 각 메서드를 사용해야 한다.
    //    - 데이터와 그 데이터를 사용하는 기능은 매우 밀접하게 연결되어 있다.
    //    - 하지만 이렇게 분리되어 있는 경우 관련 데이터가 변경이 되면 데이터와 메서드 둘 다 변경해야 한다.
    //    - 즉, 유지 보수의 포인트가 2군데가 되는 것이다.
    //    - 객체 지향 프로그래밍은 데이터와 기능을 온전히 하나로 묶어서 사용할 수 있다.
}

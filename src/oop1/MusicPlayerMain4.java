package oop1;

public class MusicPlayerMain4 {
    // 뮤직 플레이어를 사용하는 개발자
    // 객체 생성 후 메서드를 호출해서 사용만 하면 된다.
    // 어떠한 데이터가 있는지, 기능이 어떻게 짜여져 있는지 몰라도 된다
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        // 음악 플레이어 켜기
        musicPlayer.on();
        
        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 증가
        musicPlayer.volumeUp();

        // 볼륨 감소
        musicPlayer.volumeDown();
        
        // 상태 확인
        musicPlayer.showStatus();
        
        // 음악 플레이어 끄기
        musicPlayer.off();

        // 상태 확인
        musicPlayer.showStatus();
    }

    // 캡슐화
    //  - MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여 있는 것 같다.
    //  - 이렇게 속성과 기능을 하나(클래스)로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.
    //  - 사용하는 입장에서는 그 안에 있는 것이 뭔지 모르고 사용해도 된다.
    //  - 이 같은 특성 때문에 캡슐화라고 한다.
    //  - 또한 변경 소요가 있을 때 캡슐을 만든 곳에서만 변경하면, 가져다 쓰는 쪽에서는 변경하지 않아도 된다.
    //  - 하지만 메서드의 이름이 바뀌었을 때는 호출하는 곳에서도 호출할 메서드의 이름을 수정해야 한다.
    
    // 객체 지향 프로그래밍에서는 "객체(속성과 기능)을 어떻게 만들지?"가 중요
    // 절차 지향 프로그래밍에서는 "어떠한 순서로 만들어야 돼지?"가 중요
}

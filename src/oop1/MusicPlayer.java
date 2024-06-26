package oop1;

public class MusicPlayer {
    // 데이터와 기능을 하나로 묶어서 온전히 하나의 클래스에 담아 음악플레이어를 만들어보자
    // 음악 플레이어라는 객체를 지향(데이터와 기능 한번에)
    // 따라서 어떤 속성, 어떤 기능을 제공하는 지에 대해 초점을 맞춰야 한다.
    // 음악 플레이어를 만들어서 제공하는 개발자와 음악 플레이어를 사용하는 개발자가 분리되어 있다고 생각하면 된다.
    // 세상에 존재하는 사물(객체)의 속성과 기능을 프로그래밍하는 것 : 객체 지향 프로그래밍

    // 음악 플레이어를 만드는 개발자
    // 매개 변수를 넣지 않는 이유 : 자기 자신의 데이터(멤버 변수)를 쓰기 때문에 외부에서 데이터를 받아올 필요가 없다.
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어의 상태 확인");
        if (isOn == true) {
            System.out.println("음악 플레이어 ON, 현재 볼륨 : " + volume);
        } else if (isOn == false){
            System.out.println("음악 플레이어 OFF");
        }
    }
}

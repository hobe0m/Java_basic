package oop1;

public class MusicPlayerMain1 {
    // 객체 지향 프로그래밍
    // 객체 지향 프로그래밍 vs 절차 지향 프로그래밍

    // 절차 지향(중요하게 생각) 프로그래밍 : 절차(순서)를 지향, 쉽게 이야기 해서 실행 순서를 중요하게 생각하는 방식
    //  - 지금까지 해왔던 방식이 모두 절차 지향 프로그래밍, "어떻게"를 중심으로 프로그래밍 하는 것

    // 객체 지향(중요하게 생각) 프로그래밍 : 객체를 지향, 쉽게 이야기 해서 객체를 중요하게 생각하는 방식
    //  - 실제 세계의 사물이나 사건을 객체로 보고 이러한 객체들 간의 상호작용을 중심으로 프로그래밍 하는 것, 즉 "무엇을"을 중심으로 프로그래밍 하는 것
    
    // 둘의 중요한 차이 : 절차 지향은 데이터와 해당 데이터에 대한 처리 방식이 분리, 객체 지향은 데이터와 그 데이터에 대한 행동(메서드)가 하나의 '객체' 안에 함께 포함되어 있다.
    
    // 절차 지향에서 객체 지향으로 코드 변경하며 객체 지향 프로그래밍 이해

    // 절차 지향 프로그래밍의 예시, 순서에 맞춰 실행하도록 단순하게 작성
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어의 상태 확인");
        if (isOn = true) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        // 음악 플레이어 종료
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}

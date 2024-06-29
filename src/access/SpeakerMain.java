package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근(음량을 높이고 싶어서, 결과는 스피커 폭발)
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; - private을 사용해서, 접근 불가
        speaker.showVolume();

        // Speaker 객체를 사용하는 사용자는 Speaker의 volume 필드와 메서드에 모두 접근할 수 있다.
        // 그러므로 앞서 volumeUp() 메서드에서 음량이 100을 넘지 못하도록 개발했지만 소용이 없다.
        //  - 사용하는 입장에서 volume 필드에 직접 접근해서 원하는 값을 설정할 수 있기 때문이다.
        //  - 따라서 접근 제어자를 통해 접근을 제한해야 한다.
    }
}

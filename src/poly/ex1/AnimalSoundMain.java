package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        // Ctrl + Shift + v : 최근 복사한 내용 붙여넣기, 여러 번 복사한 내용을 순차적으로 붙여넣을 때 유용(히스토리를 보여줌)
        // Ctrl + Alt + v : 선택한 표현식을 새 변수로 추출, new Cow(); 까지 적으면 Cow cow가 자동 생성
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

        // 코드의 반복을 줄이기 위해 메서드나 배열 및 for문을 사용해보려고 해도 타입을 동물 중 하나로 지정해야 하기 때문에 불가능하다.
        // 따라서 지금 이 상황에서는 해결 방안이 없다(Dog, Cat, Cow의 타입이 모두 다르기 때문에).
    }


}

package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        Duck duck = new Duck();
        // 배열은 같은 타입의 데이터를 나열할 수 있기에, Animal 타입들을 나열(다형적 참조 덕)
        Animal[] animalArr = {dog, cow, cat, duck};


        // 변하지 않는 부분
        // 돌면서 animal.sound를 호출하지만 각 인스턴스에 맞는 오버라이딩 된 메서드가 실행된다.
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}

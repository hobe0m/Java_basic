package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        // 동물 각각의 객체를 생성
        Dog dog = new Dog(); // Animal에 담아도 된다.
        Cow cow = new Cow(); // Animal에 담아도 된다.
        Cat cat = new Cat(); // Animal에 담아도 된다.
        Duck duck = new Duck();

        // animal은 부모이므로 자식들의 객체를 품을 수 있고, 각각의 기능은 메서드 오버라이딩 되어 있으므로 우선된다.
        soundAnimal(dog);
        soundAnimal(cow);
        soundAnimal(cat);
        soundAnimal(duck);
    }

    // 동물들을 아우르는 Animal 객체를 받는 soundAnimal 메서드 생성
    // Animal animal이 핵심, 다형적 참조 덕에 Animal은 자식인 Dog, Cat, Cow의 인스턴스를 참조할 수 있다(부모는 자식을 담을 수 있기 때문).
    // 또한 오버라이딩 된 메서드가 있다면 우선적으로 호출된다.
    // 이런 경우에는 새로운 동물을 추가해도 이 메서드를 그대로 사용할 수 있다.
    //  - 물론 새로운 동물도 Animal을 상속 받아야 한다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 시작");
    }
}

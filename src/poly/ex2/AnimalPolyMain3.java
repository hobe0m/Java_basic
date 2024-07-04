package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        // Ctrl + Alt + V : 기존에 선언된 변수를 제거하고 현재 위치에서 합치는 것
        // Dog dog = new Dog();와 Animal[] animalArr = {dog};를 Animal[] animalArr = {new Dog()};로 바꿀 때 사용
        // 즉 배열로 생성과 동시에 변수 선언을 할 때 유용
        Animal[] animalArr = {new Dog(), new Cow(), new Cat(), new Duck()};

        // Ctrl + Alt + M : 선택한 표현식을 별도의 메서드로 추출해 재사용성과 가독성을 높인다.
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    // 새로운 동물이 추가되어도 soundAnimal() 메서드는 코드 변경 없이 유지할 수 있다.
    // 이 메서드는 구체적인 클래스(Dog, Cat, Cow..)를 참조하는 것이 아니라 Animal이라는 추상적인 부모를 참조하기 때문이다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    // 새로운 기능이 추가되었을 때 변하는 부분을 최소화 하는 것이 잘 작성된 코드이다.
    // 따라서 변하는 부분과 변하지 않는 부분을 명확하게 구분할 수 있어야 한다.
    
    // 남은 문제
    // Animal 클래스를 생성할 수 있는 문제
    //  - 개, 고양이, 소가 실제 존재하는 것은 당연하지만, 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상하다.
    //  - 이 클래스는 다형성을 위해 필요한 것이지 직접 인스턴스를 생성해서 사용할 일은 없다.
    //  - 다만, 생성해서 사용해도 기능은 잘 작동한다.
    //  - 이 때 제대로 된 기능을 수행하진 않는다(클래스 내부의 메서드는 수행하지만, 그것이 주요 기능은 아니라는 뜻).
    //  - 추상 클래스를 통해 문제를 해결할 수 있다.

    // Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성
    //  - 실수로 오버라이딩을 하지 않았을 때, animal의 sound()가 실행된다.
    //  - 추상 메서드를 통해 문제를 해결할 수 있다.

    // 이런 두 가지 문제를 추상 클래스와 추상 메서드를 통해 해결할 수 있다.
    // 좋은 프로그램은 제약이 있는 프로그램이다.
}

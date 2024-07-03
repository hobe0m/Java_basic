package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 같은 패키지 혹은 다른 패키지라도 상속 관계
        // defaultValue = 1; 다른 패키지에 접근 불가, 컴파일 오류
        // privateValue = 1; 접근 불가, 컴파일 오류
        
        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지
        // defaultMethod(); // 패키지가 다르다.
        // privateMethod(); // 같은 클래스에서만 접근 가능

        printParent();
        // 안에 default나 private이 있어도 자기 자신 것을 사용하기 때문에 호출 가능하다.
        // 상속 받은 부모의 메서드이기 때문에 부모가 사용하는 것이지 자식이 사용하는 것이 아니기 때문이다.
        // 자식이 직접 접근하는 것은 안되고 부모를 통해 접근하는 것은 가능

        // 접근 제어와 메모리 구조
        // 본인 타입에 없으면 부모 타입에서 기능을 찾는데, 이 때 접근 제어자가 영향을 미친다.
        // 왜냐하면 객체 내부에서는 자식과 부모가 구분되어 있기 때문이다.
        // 결국 자식 타입에서 부모 타입의 기능을 호출할 때, 부모의 입장에서 보면 외부에서 호출한 것과 같다.

        // child가 printParent()를 호출하고 그 내부의 default, private로 제한된 것들도 사용할 수 있는 이유
        //  - 호출된 메서드 내에서는 그 메서드가 선언된 클래스의 접근 규칙이 적용되기 때문이다.
        //  - 즉, printParent가 Parent 클래스 내부에 존재하므로, Child에서 호출하더라도 Parent의 접근 규칙이 적용된다.
        //  - 따라서, 같은 클래스에서는 private, default 모두 접근 가능하므로 사용 가능하다.
        // Child 클래스에서는 Parent 클래스의 default 및 private 멤버에 직접 접근할 수 없지만, 부모 클래스의 메서드 (printParent)를 통해 간접적으로 접근할 수 있다.
    }
}

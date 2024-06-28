package pack;

import pack.a.*;
// import pack.a.User;
// import pack.a.User2;

// 이 때 pack.a.*을 통해 pack.a.User와 pack.a.User2를 한번에 가져와서 쓸 수 있다.
// *은 패키지 하위의 모든 클래스를 가져오는 것을 뜻한다.
//  - 즉 pack.a 하위의 모든 클래스들을 가져온다.

// import : 포함해서 가져오다.
public class PackageMain2 {

    // import 사용
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import로 pack.a에 있는 User 클래스를 가져다 쓴다.
        User2 user2 = new User2(); // import로 pack.a에 있는 User2 클래스를 가져다 쓴다.
    }
    
    // 코드에서 첫 줄에는 package(현재 위치), 두 번쨰 줄에는 import(가져올 것들)을 적어주면 된다.
}

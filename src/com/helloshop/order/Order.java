package com.helloshop.order;

import com.helloshop.product.Product; // 다른 패키지 클래스를 가져다가 사용
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    // 주문할 때 주문하는 사람과 상품을 알아야 하므로 사용자와 상품 정보를 받아서 사용한다.
    // public이 있어야 다른 패키지에서 Order에 접근 가능
    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

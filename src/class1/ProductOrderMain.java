package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        int priceSum = 0;

        orders[0] = new ProductOrder();
        orders[0].productName = "두부";
        orders[0].price = 2000;
        orders[0].quantity = 2;

        orders[1] = new ProductOrder();
        orders[1].productName = "김치";
        orders[1].price = 5000;
        orders[1].quantity = 1;

        orders[2] = new ProductOrder();
        orders[2].productName = "콜라";
        orders[2].price = 1500;
        orders[2].quantity = 2;

        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + ", 가격 : " + orders[i].price + ", 수량 : " + orders[i].quantity);
            priceSum += orders[i].price * orders[i].quantity;
        }
        System.out.println("총 결제 금액 : " + priceSum);
    }

    /*

    ProductOrder[] orders = new ProductOrder[3];

    // 첫 번째 상품 주문 정보 입력
    ProductOrder order1 = new ProductOrder();
    order1.productName = "두부";
    order1.price = 2000;
    order1.quantity = 2;
    orders[0] = order1;

    // 두 번째 상품 주문 정보 입력
    ProductOrder order2 = new ProductOrder();
    order2.productName = "김치";
    order2.price = 5000;
    order2.quantity = 1;
    orders[1] = order2;

    // 세 번째 상품 주문 정보 입력
    ProductOrder order3 = new ProductOrder();
    order3.productName = "콜라";
    order3.price = 1500;
    order3.quantity = 2;
    orders[2] = order3;

    int totalAmount = 0;

    for (ProductOrder order : orders) {
        System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        totalAmount = += order.price * order.quantity;
        }
        System.out.printLn("총 결제 금액 : " + totalAmount);
        }
    */
}

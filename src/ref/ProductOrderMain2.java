package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + totalAmount);
    }

    static ProductOrder createOrder(String ProductName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = ProductName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명 : " + orders[i].productName + " 가격 : " + orders[i].price + " 수량 : " + orders[i].quantity);
        }
        // for (ProductOrder order : orders) {
        //     System.out.println("상품명 : " + orders[i].productName + " 가격 : " + orders[i].price + " 수량 : " + orders[i].quantity);
        // }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        // for (int i = 0; i < orders.length; i++) {
        //     totalAmount = orders[i].price * orders[i].quantity;
        // }
        return totalAmount;
    }
}
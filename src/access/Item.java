package access;

public class Item {

    // 상품명
    String name;

    // 상품 가격
    int price;

    // 상품 갯수
    int quantity;

    // item 객체 생성자
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // 호출 시 객체의 이름 사용 가능
    public String getName() {
        return name;
    }

    // 호출 시 객체의 합계 사용 가능
    public int totalPrice() {
        return price * quantity;
    }
}

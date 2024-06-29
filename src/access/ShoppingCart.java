package access;

public class ShoppingCart {

    // 데이터는 무조건 접근 불가하게 private 사용
    // 쇼핑카트에는 10개의 아이템까지만 담을 수 있다.
    private Item[] items = new Item[10];

    // 데이터는 무조건 접근 불가하게 private 사용
    // 담긴 아이템 개수
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 차 아이템을 더 담을 수 없습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품들을 출력합니다.");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 총합 : " + items[i].totalPrice());
        }
        System.out.println("전체 총 계 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].totalPrice();
        }
        return totalPrice;
    }
}
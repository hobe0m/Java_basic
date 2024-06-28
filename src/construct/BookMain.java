package construct;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book(); // 기본 생성자

        Book book1 = new Book("Hello Java", "Seo");

        Book book2 = new Book("JPA 프로그래밍", "kim", 700);
    }
}

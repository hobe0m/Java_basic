package construct;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        this("","",0);
    }

    Book(String title, String author) {
        this(title, author, 50);
        // 호출하려는 생성자의 매개 변수에 맞게 인수를 넣어주어야 한다.
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
    }
}

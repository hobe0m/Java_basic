package oop1;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
    /*
    // 이런 식으로도 호출해서 사용 가능
    
    Rectangle rectangle = new Rectangle();
    rectangle.width = 5;
    rectangle.height = 8;

    int area = rectangle.calculateArea();
    System.out.println("넓이: " + area);

    int perimeter = rectangle.calculatePerimeter();
    System.out.println("둘레 길이: " + perimeter);

    boolean square = rectangle.isSquare();
    System.out.println("정사각형 여부: " + square);
 }
    */
}

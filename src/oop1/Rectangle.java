package oop1;

public class Rectangle {
    
    // this : 이 객체의 필드들을 의미

    // int width = 5;
    int width;
    // int height = 8;
    int height;
    int area;
    int perimeter;
    boolean isSquare;

    int calculateArea() {
        area = width * height;
        System.out.println("넓이 : " + area);
        return area;
    }

    int calculatePerimeter() {
        perimeter = 2 * (width + height);
        System.out.println("둘레 길이 : " + perimeter);
        return perimeter;
    }

    boolean isSquare() {
        if (width == height) {
            isSquare = true;
            System.out.println("정사각형 여부 : " + isSquare);
        } else {
            isSquare = false;
            System.out.println("정사각형 여부 : " + isSquare);
        }
        return isSquare;
    }

    /*

    이런 식으로도 설계 가능

    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }
    */
}

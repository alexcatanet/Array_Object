package circle_object;

import java.util.Scanner;

public class Shape {
    Shape shape;
    Circle circle;
    Rectangle rectangle;

    public static void main(String[] args) {

        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a value:");
        circle.radius = scanner.nextInt();
        shape.circle = circle;
        shape.circle.calculateArea();

        rectangle.width = scanner.nextInt();
        rectangle.length = scanner.nextInt();
        shape.rectangle = rectangle;
        shape.rectangle.calculateAre();
        shape.rectangle.calculatePerimter();


    }
}

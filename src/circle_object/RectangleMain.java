package circle_object;

public class RectangleMain {
    public static void main(String[] args) {

        System.out.print("Please, introduce a length value and a width value:");

        Rectangle rectangle = new Rectangle();
        System.out.println();

        rectangle.calculateAre();
        rectangle.calculatePerimter();
    }
}

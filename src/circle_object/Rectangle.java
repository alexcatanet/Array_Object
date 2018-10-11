package circle_object;


class Rectangle {


    int length;
    int width;

    public void calculateAre() {
        int area = width * length;
        System.out.println("Area of the triangle is: " + area);
    }

    public void calculatePerimter() {
        int perimeter = (int) (Math.pow(length, 2) + Math.pow(width, 2));
        System.out.println("The perimeter is: " + perimeter);
    }
}

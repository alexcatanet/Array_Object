package circle_object;


class Circle {

    public double radius;


    // method that compute the area of the circle
    public void calculateArea() {

        double area = Math.PI * (Math.pow(radius, 2));

        System.out.println("The area of the circle is: " + area);
    }
}

public class Circle {
    static double PI = 3.14;
    double radius;
    String color;

    // Setters are here ....

    void setAreaAndCircumference (double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters are here ....

    double getArea(double radius, String color) {
        System.out.println(color);
        return PI * radius * radius;
    }

    double getCircumference (double radius, String color) {
        System.out.println(color);
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.getArea(4, "PINK");
        double circumference = circle.getCircumference(4, "PINK");
        System.out.println("AREA : " + area + " CIRCUMFERENCE: " + circumference);
    }
}

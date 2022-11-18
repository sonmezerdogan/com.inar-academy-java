package weeks.week_12;

public class Rectangle {

    String color;
    double longEdge;
    double shortEdge;
    private double area;
    private double perimeter;
    boolean isFilled;

    public Rectangle() {
        color = "BLACK";
        longEdge = 1;
        shortEdge = 1;
        isFilled = false;
    }
    public Rectangle(double a,double b) {
        this();
        longEdge = a;
        shortEdge = b;
    }
    public Rectangle(String c) {
        this();
        color = c;
    }
    public double getArea() {
        area = longEdge * shortEdge;
        return area;
    }
    public double getPerimeter() {
        perimeter = 2 * (longEdge + shortEdge);
        return perimeter;
    }
    public void fillTheRectangle() {
        isFilled = true;
    }
    public void cleanTheRectangle() {
        isFilled = false;
    }
    public void paintTheRectangle(String c) {
        color = c;
    }
    public void print() {
        System.out.println("---------------");
        System.out.println("long edge : " + longEdge);
        System.out.println("short edge : "+ shortEdge);
        System.out.println("area : " + getArea());
        System.out.println("perimeter : " + getPerimeter());
        System.out.println("isFilled : " + isFilled);
        System.out.println("color : " + color);
        System.out.println("---------------");
    }

}

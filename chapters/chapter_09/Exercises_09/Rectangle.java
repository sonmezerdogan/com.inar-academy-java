package chapters.chapter_09.Exercises_09;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }
    public Rectangle(double width, double height) {
       this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void print() {
        System.out.println("---------------");
        System.out.println("Width : " + width);
        System.out.println("Height : "+ height);
        System.out.printf("Area : " + "%.2f\n",getArea());
        System.out.println("Perimeter : " + getPerimeter());
        System.out.println("---------------");
    }
}

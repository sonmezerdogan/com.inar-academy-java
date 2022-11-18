package chapters.chapter_10.Exercises_10.E13;

import chapters.chapter_10.Exercises_10.E04.MyPoint;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public boolean contains(double x, double y) {
        MyPoint A = new MyPoint(this.x - width / 2, this.y + height / 2);  //Top left
        MyPoint B = new MyPoint(this.x + width / 2, this.y - height / 2);  //Bottom Right

        return x > A.getX() && y < A.getY() && x < B.getX() && y > B.getY();
    }
    public boolean contains(MyRectangle2D r) {
        if(getArea() > this.getArea()) {
            return false;
        }
        return ((r.getX() + r.getWidth() / 2) <= (this.getX() + this.getWidth() / 2)) &&
                ((r.getX() - r.getWidth() / 2) >= (this.getX() - this.getWidth() / 2)) &&
                ((r.getY() + r.getHeight() / 2) <= (this.getY() + this.getHeight() / 2)) &&
                ((r.getY() - r.getHeight() / 2) >= (this.getY() - this.getHeight() / 2));
    }
    public boolean overlaps(MyRectangle2D r) {
        MyPoint rec1TopLeft = new MyPoint(r.getX() - r.getWidth() / 2, r.getY() + r.getHeight() / 2);
        MyPoint rec1BottomRight = new MyPoint(r.getX() + r.getWidth() / 2, r.getY() - r.getHeight() / 2);
        // Points for current object rectangle
        MyPoint rec2TopLeft = new MyPoint(this.getX() - this.getWidth() / 2, this.getY() + this.getHeight() / 2);
        MyPoint rec2BottomRight = new MyPoint(this.getX() + r.getWidth() / 2, this.getY() - this.getHeight() / 2);

        return (rec1TopLeft.getX() < rec2BottomRight.getX() && rec2TopLeft.getX() < rec1BottomRight.getX()) &&
                (rec1TopLeft.getY() > rec2BottomRight.getY() && rec2TopLeft.getY() > rec1BottomRight.getY());

    }

    public double getX() {
        return x;
    }

    public MyRectangle2D setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public MyRectangle2D setY(double y) {
        this.y = y;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public MyRectangle2D setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public MyRectangle2D setWidth(double width) {
        this.width = width;
        return this;
    }

}

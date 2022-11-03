package chapters.chapter_09.Exercises_09;
/*  UML DIAGRAM
    -----------------------
    n : int
    side : double
    x : double
    y : double
    ------------------------
    +RegularPolygon()
    +RegularPolygon(n: int , side: double , x: double , y: double)
    +RegularPolygon(n: int , side: double )
    +getN(): int
    +getSide(): double
    +getX(): double
    +getY(): double
    +setN(n : int) : void
    +setSide(side: double): void
    +setX(x: double): void
    +setY(y: double): void
    +getPerimeter() : double
    +getArea(): double
     ------------------------
 */
public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    public RegularPolygon() {
        this(3, 1, 0, 0);
    }
    public RegularPolygon(int n, double side) {
        this(n, side, 0, 0);
    }
    public int getN() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter() {
        return n * side;
    }
    public double getArea() {
        return (n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n));
    }
}

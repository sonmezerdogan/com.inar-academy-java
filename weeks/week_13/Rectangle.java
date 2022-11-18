package weeks.week_13;

public class Rectangle {
    private int corner;
    private int diagonal;
    private int interiorAngle;

    public Rectangle(){

    }
    public Rectangle(int corner) {
        this.corner = corner;
        diagonal  = (corner*(corner-3))/2;
        interiorAngle = (180*(corner-2))/corner;
    }
    @Override
    public String toString() {
        return "A regular polygon with "+corner + " corner has got " + diagonal + " diagonal and "+
                "an interior angle is " + interiorAngle;
    }

    public static void main(String[] args) {
        Rectangle triangle = new Rectangle(3);
        System.out.println(triangle);
    }
}


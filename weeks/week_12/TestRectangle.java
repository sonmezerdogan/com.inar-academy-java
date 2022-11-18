package weeks.week_12;

public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.print();

        Rectangle r2 = new Rectangle(4, 40);
        r2.print();

        Rectangle r3 = new Rectangle(3.5, 35.9);
        r3.print();

        r2.fillTheRectangle();
        r2.print();

        r3 = new Rectangle("BLUE");
        r3.print();
    }
}

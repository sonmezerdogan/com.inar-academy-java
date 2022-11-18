package weeks.week_12;

public class CircleTest {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.print();

        Circle c2 = new Circle(5);
        c2.print();

        c2.fillTheCircle();
        c2.print();


    }
}

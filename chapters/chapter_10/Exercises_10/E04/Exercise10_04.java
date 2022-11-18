package chapters.chapter_10.Exercises_10.E04;

public class Exercise10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.println("The distance between point1(0,0) and point2(10,30.5) is: " + point1.distance(point2));
    }

}

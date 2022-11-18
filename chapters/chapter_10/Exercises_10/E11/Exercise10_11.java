package chapters.chapter_10.Exercises_10.E11;

public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Circle2D c1 = new Circle2D(2, 2, 5.5):");
        System.out.println("Circle2D c1's area = " + c1.getArea());

        System.out.println("perimeter = " + c1.getPerimeter());

        System.out.println("Result of c1.contains(3,3) = " + c1.contains(3, 3));
        System.out.println("Result of c1.contains(new Circle2D(4,5,10.5)) = " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Result of c1.overlaps(new Circle2D(3,5,2.3)) = " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }

}

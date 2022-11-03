package chapters.chapter_09.Exercises_09;

public class Exercise9_09 {

    public static void main(String[] args) {

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        RegularPolygon[] polygon = {polygon1, polygon2, polygon3};
        for (int i = 0; i < polygon.length; i++) {

            System.out.println("Regular polygon " + (i+1) +"'s perimeter is: "+ polygon[i].getPerimeter() +
                    " and area is: " + polygon[i].getArea());
        }
    }
}

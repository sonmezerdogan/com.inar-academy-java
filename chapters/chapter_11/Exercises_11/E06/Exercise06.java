package chapters.chapter_11.Exercises_11.E06;

import chapters.chapter_10.Listing_10.Loan;
import chapters.chapter_11.Listing_11.CircleFromSimpleGeometricObject;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("This is Exercise 06");
        list.add(new CircleFromSimpleGeometricObject(5));
        for (Object object:list) {
            System.out.println(object.toString());


        }


    }
}

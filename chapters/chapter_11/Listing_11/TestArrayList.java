package chapters.chapter_11.Listing_11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        System.out.print(cityList.toString());

        System.out.println("List size : " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list "+cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " +cityList.isEmpty());

        cityList.add(2, "Xian");
        cityList.remove("Miami");
        System.out.print(cityList.toString());
        cityList.remove(1);

        System.out.println(cityList.toString());
        for (int i = cityList.size()-1; i >=0; i--)
            System.out.print(cityList.get(i)+" ");
            System.out.println();

        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));
        System.out.println("The area of the circle ? "+list.get(0).getArea());

    }
}

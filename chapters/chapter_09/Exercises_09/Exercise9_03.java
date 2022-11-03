package chapters.chapter_09.Exercises_09;

import java.util.Date;

public class Exercise9_03 {
    public static void main(String[] args) {
        long s= 10_000;
        while (s < 100_000_000_001L){
            Date date = new Date(s);
            System.out.println(s+ " = " + date.toString());
            s *= 10;
        }
    }
}





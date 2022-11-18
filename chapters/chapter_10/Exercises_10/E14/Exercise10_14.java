package chapters.chapter_10.Exercises_10.E14;

import java.util.GregorianCalendar;

public class Exercise10_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        MyDate date3 = new MyDate(561555550000L);

        System.out.println("Date 1 :\n "+ date1.getYear() +":" + date1.getMonth() + ":" + date1.getDay());
        System.out.println("Date 2 :\n "+ date2.getYear() +":" + date2.getMonth() + ":" + date2.getDay());
        System.out.println("Date 3 :\n "+ date3.getYear() +":" + date3.getMonth() + ":" + date3.getDay());

    }
}

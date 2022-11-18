package chapters.chapter_09.Exercises_09;
import java.util.GregorianCalendar;
public class Exercise9_05 {
    public static void main(String[] args) {

        GregorianCalendar day = new GregorianCalendar();
        System.out.print(day.get(GregorianCalendar.YEAR) + ":");
        System.out.print(day.get(GregorianCalendar.MONTH) + ":");
        System.out.print(day.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();

        day.setTimeInMillis(1234567898765L);
        System.out.println("The day after 1234567898765L milliseconds from January 1, 1970 :");
        System.out.print(day.get(GregorianCalendar.YEAR) + ":");
        System.out.print(day.get(GregorianCalendar.MONTH) + ":");
        System.out.print(day.get(GregorianCalendar.DAY_OF_MONTH));
    }
}

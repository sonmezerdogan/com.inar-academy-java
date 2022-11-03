package chapters.chapter_09.Listing_09;

public class Date {
    public static void main(String[] args) {

        java.util.Date time = new java.util.Date();
        System.out.println(time.getTime());
        time.setTime(1000);
        System.out.println(time);

        System.out.println(time.toString());



    }


}

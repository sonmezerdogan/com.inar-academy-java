package chapters.chapter_06;


public class Exercise6_25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(5500));
        System.out.println(convertMillis(100000));
        System.out.println(convertMillis(555550000));

    }
    public static String convertMillis(long millis){
       long hour=millis/3600000;
       long minute=(millis/60000)%60;
       long second=(millis/1000)%60;

        return hour+":"+minute+":"+second;
    }
}

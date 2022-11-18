package chapters.chapter_06;

public class Exercise6_16 {
    public static void main(String[] args) {
        System.out.println("Year   Days In Year");
        System.out.println("-------------------");
        for(int year=2000; year<=2020; year++){

              System.out.println(year+"    "+daysInYear(year));
        }

    }
    public static int daysInYear(int year){
        if(isLeapYear(year)) {
            return 366;
        }else{
            return 365;
    }

}
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

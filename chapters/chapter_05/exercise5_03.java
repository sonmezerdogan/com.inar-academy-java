package chapters.chapter_05;

public class exercise5_03 {

    public static void main(String[]args){

        final double POUND = 2.2;
        System.out.println("Kilograms    Pounds");
        for(int i=1; i<200; i+=2) {

            System.out.printf( "%-10d%9.1f\n",i ,(i*POUND));



        }
    }
}

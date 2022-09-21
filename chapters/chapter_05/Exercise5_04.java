package chapters.chapter_05;

public class Exercise5_04 {

    public static void main(String[]args){

        final double MILES= 1.609;
        System.out.println("Miles     Kilometers");

        for(int i=1; i<11; i++){

            System.out.printf("%-10d%-4.3f\n", i, (i*MILES));

        }


    }
}

package chapters.chapter_05;

public class Exercise5_05 {

    public static void main(String[]args){

        System.out.println("Kilograms Pounds | Pounds Kilograms");
        final double POUND = 2.2;

        for(int i=1, j=20; i<200; i+=2, j+=5) {
            if(i<10) {
                System.out.print(i + "  ");
            }else if(i<100) {
                System.out.print(i + " ");
            }else {
                System.out.print(i + "");
            }
           System.out.printf("%12.1f  |", (i*2.2));
            System.out.printf(" %-4d", j);
            System.out.printf("%11.2f\n", (j/2.2));

            }




    }
}

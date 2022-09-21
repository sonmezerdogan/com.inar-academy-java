package chapters.chapter_05;

public class Exercise5_06 {

    public static void main(String[]args){

        final double MILES = 1.609;
        System.out.println("Miles Kilometers | Kilometers   Miles");

        for(int i=1, j=20; i<=10; i++, j+=5) {
            if(i<10) {
                System.out.print(i + "  ");
            }else{
                System.out.print(i + " ");
                }
            System.out.printf("%12.3f  |", (i*MILES));
            System.out.printf(" %-4d", j);
            System.out.printf("%15.3f\n", (j/MILES));

        }
    }
}

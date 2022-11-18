package chapters.chapter_06;

public class Exercise6_13 {
    public static void main(String[] args) {
        int i=1;
        System.out.println("i       m(i)");
        System.out.println("--------------");
        miSum(i);


    }

    public static void miSum(int i) {

        double miSum = 0;
        for (i = 1; i <= 20; i++) {
            miSum+=i/(1.0+i);
            System.out.printf("%-4d%8.4f\n",i,miSum);


        }



    }
}

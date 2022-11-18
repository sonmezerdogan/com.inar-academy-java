package chapters.chapter_06;

public class Exercise6_14 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i       m(i)");
        System.out.println("--------------");
        miSum(i);


    }

    public static void miSum(int i) {

        double miSum = 0;
        for (i = 1; i <= 901; i++) {
            miSum +=4*(Math.pow(-1,i+1)/(2*i-1));
            System.out.printf("%-4d%8.4f\n", i, miSum);
        }
    }
}

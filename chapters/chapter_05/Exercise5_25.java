package chapters.chapter_05;

public class Exercise5_25 {

    public static void main(String[]args){
        double sum1=0;
        double sum2=0;
        double sum3=0;

        for(int i=10000; i>=1; i--){
            sum1+=Math.pow(-1, (i+1))/(2*i-1);
        }
        System.out.printf("The PI for n= 10_000 is : "+"%.6f\n",4*sum1);

        for(int i=20000; i>=1; i--){
            sum2+=Math.pow(-1, (i+1))/(2*i-1);

        }
        System.out.printf("The PI for n= 20_000 is : "+"%.6f\n",4*sum2);

        for(int i=100000; i>=1; i--){
            sum3+=Math.pow(-1, (i+1))/(2*i-1);

        }
        System.out.printf("The PI for n=100_000 is : "+"%.6" +
                "f\n",4*sum3);




    }
}

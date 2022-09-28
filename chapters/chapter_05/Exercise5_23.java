package chapters.chapter_05;

public class Exercise5_23 {

    public static void main(String[]args){
        int n=50000;
        double sum=1.0/n;
        double sum2=1;
        for(int i=1; i<=50000; i++ ){
            sum+=1.0/(n-1);
        }
        for(int i=1; i<=50000; i++){
            sum2+=1.0/(i+1);
        }
        System.out.printf("Computing series for n = 50000 from right to left: 1 + 1/2 + 1/3 + ...1/n  : "+"%.6f\n",sum);

        System.out.printf("Computing series for n = 50000 from left to right: 1 + 1/2 + 1/3 + ...1/n  : "+"%.6f\n",sum2);
    }
}

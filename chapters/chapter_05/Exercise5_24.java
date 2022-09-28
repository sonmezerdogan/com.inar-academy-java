package chapters.chapter_05;

public class Exercise5_24 {

    public static void main(String[]args){
        double sum=0;
        for(int i=1; i<100; i+=2){
            sum+=i/(i+2.0);


        }
        System.out.printf("%.6f",sum);
    }
}

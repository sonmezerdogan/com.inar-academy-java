package chapters.chapter_05;

public class Exercise5_26 {

    public static void main(String[]args){
        double sum1=1;
        double sum2=1;
        double sum3=1;
        double sum4=1;
        double sum5=1;
        double sum6=1;



        for(int i=1; i<=10000; i++){


            sum2+=(sum1*=1.0/i);
        }
        System.out.println(sum2);
        for(int i=1; i<=20000; i++){


            sum4+=(sum3*=1.0/i);
        }
        System.out.println(sum4);
        for(int i=1; i<=100000; i++){


            sum6+=(sum5*=1.0/i);
        }
        System.out.println(sum6);
    }
}

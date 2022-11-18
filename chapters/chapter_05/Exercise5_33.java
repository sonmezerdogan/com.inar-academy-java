package chapters.chapter_05;

public class Exercise5_33 {
    public static void main(String[]args){
        System.out.println("The perfect numbers to 10000 are :");

        for(int i=10000; i>=6; i--){
            int sum=0;
            int divisor=i/2;
            while(divisor>0) {
                if (i % divisor == 0) {
                    sum += divisor;
                }
                divisor--;
            }
            if(sum==i) {
                System.out.println(i);
            }





        }


    }
}

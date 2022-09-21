package chapters.chapter_05;

public class Exercise5_07 {

    public static void main(String[]args){

        double tuition=10_000;

        for(int i=1; i<=14; i++){
            double s=Math.pow((1 + 0.05),i);

            if(i<=10) {
                System.out.println("After " + i + " year the tuition will be: ");
                System.out.println((int)(tuition * s));

            }


        }
        System.out.println("The total cost of 4 years after the tenth year: " +
                (int)(tuition * (Math.pow((1 + 0.05), 14))-tuition * (Math.pow((1 + 0.05), 10))));
    }
}

package chapters.chapter_07;

public class analyzingNumbers {
    public static void main(String[] args) {
        java.util.Scanner input= new java.util.Scanner(System.in);
        System.out.println("Enter how many numbers? :");
        int n= input.nextInt();
        System.out.println("Enter the numbers : ");
        double[] numbers = new double[n];
        double sum=0;

        for (int i = 0; i < n; i++) {
            numbers[i]= input.nextDouble();
            sum+=numbers[i];
        }
        double average= sum/n;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>average){
            count++;
        }
        }
        System.out.println("Average is : "+average);
        System.out.println("Numbers above average are : "+count);
    }
}

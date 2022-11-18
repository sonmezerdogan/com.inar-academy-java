package chapters.chapter_06;

public class Exercise6_09 {
    public static void main(String[] args) {
        double feet=10;
        double meter=65;
        System.out.println("feet        meter          |      meter       feet");
        System.out.println("_____________________________________________________");



        while (feet >= 1.0 && meter >= 20.0) {
            System.out.printf("%-12.1f%-14.3f",feet,feetToMeter(feet));
            System.out.printf(" |%10.1f%15.3f",meter, meterToFeet(meter));
            System.out.println();

            feet-=1;
            meter-=5;
        }

    }
    public static double feetToMeter(double feet){
        return  0.305 * feet;

    }
    public static double meterToFeet(double meter){
        return 3.279 * meter;
    }
}

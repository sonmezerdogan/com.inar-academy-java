package chapters.chapter_10.Listing_10;

public class UseBMIClass {

    public static void main(String[] args) {

        BMI bmi1 = new BMI("Orhan Son", 11, 80, 600);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        BMI bmi2 = new BMI("Bugra Son", 145, 720);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }

}

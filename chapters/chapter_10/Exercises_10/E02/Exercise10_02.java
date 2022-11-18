package chapters.chapter_10.Exercises_10.E02;

public class Exercise10_02 {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Orhan Son", 19, 70, 145);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Bugra Son", 80, 215);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
        BMI bmi3 = new BMI("Ali Soner", 50, 90,10,50);
        System.out.println("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() +" " +  bmi3.getStatus());
    }
}

package chapters.chapter_11.Exercises_11.E08;

public class Exercise08 {
    public static void main(String[] args) {
        Account test = new Account("George", 1122, 1000);
        test.setAnnualInterestRate(1.5);
        test.deposit(30);
        test.deposit(40);
        test.deposit(50);
        test.withDraw(5);
        test.withDraw(4);
        test.withDraw(2);
        System.out.println(test.toString());
    }
}

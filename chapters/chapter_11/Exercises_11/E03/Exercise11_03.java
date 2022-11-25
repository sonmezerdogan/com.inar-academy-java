package chapters.chapter_11.Exercises_11.E03;

public class Exercise11_03 {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(25, 25000, 100);
        SavingsAccount s = new SavingsAccount(65, 10000);

        c.withDraw(5000);
        s.withDraw(100);

        System.out.println(c.toString());
        System.out.println("------------------------");
        System.out.println(s.toString());
    }

}

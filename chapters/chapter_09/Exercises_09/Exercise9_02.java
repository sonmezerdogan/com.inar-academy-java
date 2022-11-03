package chapters.chapter_09.Exercises_09;

public class Exercise9_02 {

    public static void main(String[] args) {

        Stock S = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println("The price change for " + S.getSymbol() + " " +
                S.getName() + " is ");
        System.out.printf("%.4f",S.getChangePercent());
    }
}

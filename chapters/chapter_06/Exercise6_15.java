package chapters.chapter_06;

public class Exercise6_15 {
    public static void main(String[] args) {
        System.out.print("taxable     Single     Married Joint     Married     Head of");
        System.out.print("\nIncome                 or Qualifying     Separate    a House");
        System.out.print("\n                       Widow(er)                            ");


        for (int Income = 50_000; Income <= 60_000; Income += 50) {

            System.out.print("\n" + Income);
            System.out.print("      " + Math.round(computeTax(0, Income)));
            System.out.print("      " + Math.round(computeTax(1, Income)));
            System.out.print("      " + Math.round(computeTax(2, Income)));
            System.out.print("      " + Math.round(computeTax(3, Income)));
        }
    }
    public static double computeTax(int status, double taxableIncome){
            double tax = 0;


            if (status == 0 || status == 2) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            }
            else if (status == 1) {
                    tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            }
            else if (status == 3) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            }

            return tax;


        }




}

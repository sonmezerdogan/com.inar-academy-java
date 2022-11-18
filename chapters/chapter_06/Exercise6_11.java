package chapters.chapter_06;

public class Exercise6_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount      Commission");
        System.out.println("-----------------------------");
        for(double salesAmount=10_000; salesAmount<=100_000; salesAmount+=5000) {
            //System.out.print(salesAmount + "      ");
            System.out.printf("%-10.1f%16.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount){
        double commission=0;
            if(salesAmount<=5_000){
                commission=salesAmount*8/100;

            }
            if(salesAmount<=10_000){
                commission=(salesAmount-5000)*10/100+(5_000*8.0/100);

            }
            if(salesAmount>10_000){
                commission+=(salesAmount-10_000)*12/100+(5_000*8.0/100)+(5_000*10.0/100);
            }

            return commission;
        }


}

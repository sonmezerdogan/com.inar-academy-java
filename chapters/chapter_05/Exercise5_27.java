package chapters.chapter_05;

public class Exercise5_27 {
    public static void main(String[]args){
        int ctn=0;

        for(int year=101; year<=2100; year++)
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.print(year+" ");
                ctn++;
                if(ctn%10==0){
                    System.out.println(year);
                }
            }
    }
}

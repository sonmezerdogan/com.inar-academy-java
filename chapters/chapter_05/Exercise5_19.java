package chapters.chapter_05;

import java.sql.SQLOutput;

public class Exercise5_19 {
    public static void main(String[]args){
        int space=7;
        int right=0;
        for(int i=1; i<=8; i++){
            for(int j=0; j<=space; j++){
                System.out.print("    ");
            }
            for(int k=0; k<i; k++){
                System.out.printf("%4d",(int)(Math.pow(2,k)));
            }
            //Burası düzelecek
            for(int l=right; l>0; l--){
                System.out.printf("%4d",(int)(Math.pow(2,l-1)));
            }
            space--;
            right=i;
            System.out.println();

        }
    }
}

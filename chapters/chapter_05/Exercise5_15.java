package chapters.chapter_05;

public class Exercise5_15 {

    public static void main(String[]args){

        int cnt=0;

        for(int i=33; i<=126; i++){

            System.out.print((char) i+" ");
            cnt++;
            if(cnt%10==0){
                System.out.println();
            }
        }
    }
}

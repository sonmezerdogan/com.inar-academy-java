package chapters.chapter_05;

    public class Exercise5_31 {
        public static void main(String[]args){
            System.out.println("Month    CD Value");
            double cd=10000.0;

            for(int i=1; i<=18; i++){
                int cnt=0;

                cd+=cd * 5.75/1200;
                System.out.printf("%d%15.2f\n",i,cd);
                while(cnt<18)
                cnt++;



            }
        }
}

package chapters.chapter_05;

public class Exercise5_11 {

    public static void main(String[] args) {
        int cnt = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                if (!(i % 5 == 0 && i % 6 == 0))

                    System.out.print(i + " ");


                cnt++;
                if (cnt % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

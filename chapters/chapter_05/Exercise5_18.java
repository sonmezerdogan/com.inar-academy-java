package chapters.chapter_05;

public class Exercise5_18 {
    public static void main(String[]args) {
        System.out.println("Pattern A     Pattern B        Pattern C    Pattern D");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j+" ");
                }
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j+" ");
            }
                System.out.println();
            }

    }
}

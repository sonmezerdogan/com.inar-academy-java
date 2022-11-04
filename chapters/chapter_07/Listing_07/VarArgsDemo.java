package chapters.chapter_07;

public class VarArgsDemo {
    public static void main(String[] args) {
        charMax('c','g','k','h','d','z');
        charMax('o','f','s','p','z');
        }

         public static void charMax(char... chars) {
        if (chars.length == 0) {
            System.out.println("No argument passed");
            return;
            }

        double result = chars[0];

        for (int i = 1; i < chars.length; i++)
            if (chars[i] > result)
            result = (char)(chars[i]);

        System.out.println("The max value is " + result);
    }
}

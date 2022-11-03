package chapters.chapter_07.Exercises_07;

public class Exercise7_18 {
    public static void main(String[] args) {
        double[]list = new double[]{2.3, 9.4, 5.6, 4.7, 8.1, 1.5, 6.3, 7.4, 5.5, 9.3};
        bubbleSortedArray(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        }
        public static void bubbleSortedArray(double[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                for (int j = i + 1; j < list.length; j++) {

                    if (list[i] > list[j]) {
                        double temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }
        }

}

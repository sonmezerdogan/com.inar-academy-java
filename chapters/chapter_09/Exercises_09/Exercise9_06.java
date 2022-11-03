package chapters.chapter_09.Exercises_09;

public class Exercise9_06 {

    public static void main(String[] args) {

        int[] array = getTestArray();

        StopWatch time = new StopWatch();
        getSort(array);
        time.stop();

        System.out.println("The execution time of sorting 100,000 numbers is: "+
                time.getElapsedTime()/1000 +" seconds");
    }

    private static void getSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    private static int[] getTestArray() {
        int[] result = new int[100000];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random()*100000);
        }
        return result;
    }
}

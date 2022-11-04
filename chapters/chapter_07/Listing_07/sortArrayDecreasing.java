package chapters.chapter_07;

public class sortArrayDecreasing {
    public static void main(String[] args) {
        double[] arr = {1,9,4.5,6.6,5.7,-4.5};
        for (int i = 0; i < arr.length-1; i++) {
            double currentMax = arr[i];
            int currentMaxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(currentMax < arr[j]){
                    currentMax = arr[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex!=i){
                arr[currentMaxIndex] =arr[i];
                arr[i] = currentMax;
            }
            System.out.print(currentMax+" ");
        }


    }
}

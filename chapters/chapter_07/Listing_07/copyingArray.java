package chapters.chapter_07;

public class copyingArray {
    public static void main(String[] args) {

        int[] sourceArray = {2,3,1,5,10};
        int[] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
            //System.out.print(targetArray[i] + ",");

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.print(targetArray[i]+" ");
    }
        System.out.println();
        System.out.println("-----------------------------------");

        int[] source = {3,4,5};
        int[] t = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            t[i] =source[i];
            System.arraycopy(source, 0, t, 0, source.length);
            System.out.print(t[i]+" ");

        }

    }
}

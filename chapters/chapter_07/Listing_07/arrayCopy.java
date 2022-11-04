package chapters.chapter_07;

public class arrayCopy {
    public static void main(String[] args) {
        arrayReferenceCopy();
        System.out.println("-------------------------------");

        arrayElementCopy();
    }
    private static void arrayElementCopy() {
        int[] arr1={8,9,10};
        int[] arr2={11,12,13};

        System.out.println("arr1[0]: "+arr1[0]);
        System.out.println("arr2[0]: "+arr2[0]);

        for (int i = 0; i < 3; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println("arr1[0]: "+arr1[0]);
        System.out.println("arr2[0]: "+arr2[0]);

        arr2[2]= 99;
        System.out.println("arr2[2]: "+arr2[2]);
        System.out.println("arr1[2]: "+arr1[2]);
    }
    private static void arrayReferenceCopy() {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};

        System.out.println("arr1[0]: "+arr1[0]);
        System.out.println("arr2[0]: "+arr2[0]);
        arr2=arr1;

        System.out.println("arr1[0]: "+arr1[0]);
        System.out.println("arr2[0]: "+arr2[0]);
        arr2[2]= 99;
        System.out.println("arr2[2]: "+arr2[2]);
        System.out.println("arr1[2]: "+arr1[2]);


    }
}

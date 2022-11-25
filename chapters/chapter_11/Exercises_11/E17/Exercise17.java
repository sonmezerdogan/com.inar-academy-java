package chapters.chapter_11.Exercises_11.E17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int m = input.nextInt();
        int n = findN(findSmallestFactors(m));


        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + m * n);

    }
    public static ArrayList<Integer> findSmallestFactors(int m) {
        ArrayList<Integer> list =new ArrayList<>();

        for(int f = 2; m != 1; f++){
            if(m % f == 0){
                list.add(f);
                m /= f;
                f = 1;
            }
        }
        System.out.println(list);
        return list;
    }
    public static Integer findN(ArrayList<Integer> factors) {
        ArrayList<Integer> oddCounts = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int num = factors.get(i);
            int count = 0;
            for (Integer integer : factors) {
                if(integer == num){
                    count++;
                }

            }
            if(count % 2 != 0 && !oddCounts.contains(num)){
                oddCounts.add(num);
            }
        }
        Integer result = 1;
        for(Integer oddCount : oddCounts){
            result *=oddCount;
        }
        return result;
    }
}

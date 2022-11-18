package weeks.week_12;

import java.util.Arrays;

public class SplitStudy {
    public static void main(String[] args) {
        study1();
        study2();
        study3();
    }
    public static void study1() {
        String s1 = " taHavasahavaYaHAVA ";
        String[] splitted = s1.trim().toUpperCase().split("HAVA");
        display(splitted);
        int count = splitted.length;
        System.out.println(count);




    }
    public static void display(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
    public static void study2() {
        String s2 = " i,n,h,e,r,i,t,a,n,c,e ";
        String[] splitted = s2.trim().toUpperCase().split(",");
        display(splitted);
    }
    public static void study3() {
        String s3 = "i,n,h,e,r,i,t,a,n,c,e ";
        String str= s3.replace("," , "");
        System.out.println(str);;
    }
}

package chapters.chapter_10.Exercises_10.E03;

import static chapters.chapter_10.Exercises_10.E03.MyInteger.parseInt;

public class Exercise10_03 {
    public static void main(String[] args) {
        MyInteger test1 = new MyInteger(33);
        MyInteger test2 = new MyInteger(68);

        String s1 = "";
        if(test1.isEven()){
            s1 += "even";
        } else if (test1.isOdd()) {
            s1 += "odd";
        } else if (test1.isPrime()) {
            s1 += "prime";
        }
        System.out.println("MyInteger test1 " + test1.getValue() + " is " + s1);

        String s2 = "";
        if(test2.isEven()){
            s2 += "even";
        } else if (test2.isOdd()) {
            s2 += "odd";
        } else if (test2.isPrime()) {
            s2 += "prime";
        }
        System.out.println("MyInteger test2 " + test2.getValue() + " is " + s2);

        String test3 = "";
        int number = 33;
        if(test1.equals(number)) {
            test3 += "equal";
        } else if (!test1.equals(number)) {
            test3 += "not equal";
        }
        System.out.println("Integer number " + number + " and test1 " + test1.getValue() + " is " + test3 );

        char[] test4 = {9, 8, 7};
        System.out.println("The array test4 {9,8,7} is integer value of " + parseInt(test4) );

        String test5 = "4567";
        System.out.println("Test5 string 4567 is the integer number " + parseInt(test5));
    }
}

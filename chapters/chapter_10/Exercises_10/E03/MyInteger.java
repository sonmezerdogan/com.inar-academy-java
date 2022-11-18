package chapters.chapter_10.Exercises_10.E03;

public class MyInteger {

    private int value;

    public MyInteger (int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }
    public boolean isOdd() {
        if (value % 2 != 0)
            return true;
        else
            return false;
    }
    public boolean isPrime() {
        boolean prime = false;
        for (int i = 3; i < value / 2; i++) {
            if (value % i == 0) {
                prime = false;
            } else {
                prime = true;
                break;
            }
        }

        return prime;
    }
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        else if (num == 2)
            return true;
        else
            for (int n = 3; n < Math.sqrt(num); n += 2) {
                if (num % n == 0)
                    return false;
            }

        return true;
    }
    public static boolean isPrime(MyInteger num) {
        return num.isPrime();
    }
    public static boolean isEven(MyInteger num) {
        return num.isEven();
    }
    public static boolean isOdd(MyInteger num) {
        return num.isOdd();
    }
    public boolean equals(int a) {
        if (this.value == a) {
            return true;
        } else
            return false;
    }
    public boolean equals(MyInteger num) {
        return equals(num.getValue());
    }
    public static int parseInt(char[] arr) {
        String str = String.valueOf(arr);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }

}

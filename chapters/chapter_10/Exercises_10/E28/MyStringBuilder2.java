package chapters.chapter_10.Exercises_10.E28;

import java.util.Arrays;

public class MyStringBuilder2 {
    private char[] values;

    public MyStringBuilder2() {
        this("".toCharArray());
    }

    public MyStringBuilder2(char[] chars) {
        this.values = chars;
    }

    public MyStringBuilder2(String s) {
        this(s.toCharArray());
    }


    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] array = new char[s.values.length + offset];
        System.arraycopy(this.values, 0, array, 0, offset);
        System.arraycopy(s.values, 0, array, offset, s.values.length);
        this.values = array;

        return this;
    }


    public MyStringBuilder2 reverse() {
        char[] seulav = new char[values.length];
        for (int i = values.length - 1, j = 0; i >= 0; i--, j++) {
            seulav[j] = values[i];
        }
        this.values = seulav;
        return this;

    }

    public MyStringBuilder2 substring(int begin) {
        String s = "";
        for (int i = begin; i < values.length; i++) {
            s += values[i];
        }
        return new MyStringBuilder2(s);

    }

    public MyStringBuilder2 toUpperCase() {
        String s = String.valueOf(values);
        String UPCASE = s.toUpperCase();
        values = Arrays.copyOf(UPCASE.toCharArray(), values.length);
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(values);
    }
}

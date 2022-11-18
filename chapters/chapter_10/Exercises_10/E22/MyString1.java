package chapters.chapter_10.Exercises_10.E22;

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }
    public char charAt(int index) {
        return this.chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString1 substring(int begin, int end) {
        char[] c = new char[end - begin];
        for (int indexChars = begin, indexC = 0; indexChars < end; indexChars++, indexC++) {
            c[indexC] = chars[indexChars];
        }
        return new MyString1(c);
    }
    public MyString1 toLowerCase() {
        char[] lowerCase = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z') {
                lowerCase[i] = (char) (chars[i] + ('a' - 'A'));
            } else {
                lowerCase[i] = chars[i];
            }
        }
        return new MyString1(lowerCase);
    }
    public boolean equals(MyString1 s) {
        for (int i = 0; i < chars.length; i++) {
            if(s.charAt(i) == charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static MyString1 valueOf(int i) {
        int counter = 0;
        int number = i;

        while(number > 0){
            number /= 10;
            counter++;
        }
        char[] ch = new char[counter];

        for (int j = counter - 1; j >= 0 ; j--) {

            ch[j] = (char)('0' + i % 10);
            i /= 10;
        }
        return new MyString1(ch);

    }



}

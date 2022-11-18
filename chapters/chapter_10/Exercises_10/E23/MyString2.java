package chapters.chapter_10.Exercises_10.E23;

public class MyString2 {
    private char[] chars;

    public MyString2() {
        this.chars = new char[5];
    }
    public MyString2(String str) {
        this.chars = str.toCharArray();
    }
    public int compare(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(chars[i] > str.charAt(i)){
                return 1;
            } else if (chars[i] < str.charAt(i)) {
                return -1;
            }else {
                continue;
            }
        }
        return 0;
    }
    public MyString2 substring(int begin) {
        String s = "";
        for (int i = begin; i < chars.length; i++) {
            s += chars[i];
        }
        return new MyString2(s);
    }
    private static String createString(char[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
    public MyString2 toUpperCase() {
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(this.chars[i])) {
                this.chars[i] = Character.toUpperCase(this.chars[i]);
            }
        }
        String s = createString(this.chars);
        return new MyString2(s);
    }
    public char[] toChars() {
        return chars;
    }
    public String toString() {
        return createString(this.chars);
    }
    public static MyString2 valueOf(boolean b) {
        return b? new MyString2("true") : new MyString2("false");
    }
}

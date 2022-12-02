package chapters.chapter_12.CheckPOints;

public class den {
    public static void main(String[] args) {
        System.out.println(1 / 0);
    }
}
class Test {
    public static void main(String[] args) {
        int[] list = new int[5];
        System.out.println(list[5]);
    }
}
class Test1 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.charAt(3));
    }
}
class Test2 {
    public static void main(String[] args) {
        Object o = new Object();
        String d = (String) o;
    }
}
class Test3 {
    public static void main(String[] args) {
        Object o = null;
        System.out.println(o.toString());
    }
}
class Test4 {
    public static void main(String[] args) {
        System.out.println(1.0 / 0);
    }
}
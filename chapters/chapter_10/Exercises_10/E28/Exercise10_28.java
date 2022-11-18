package chapters.chapter_10.Exercises_10.E28;

public class Exercise10_28 {
    public static void main(String[] args) {
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("inar Academy");
        System.out.print("Start MyStringBuilder2 values: ");
        System.out.println(myStringBuilder2.toString());
        System.out.print("ToUpperCase: ");
        System.out.println(myStringBuilder2.toUpperCase().toString());
        System.out.print("Insert: ");
        myStringBuilder2.insert(4, new MyStringBuilder2("software"));
        System.out.println(myStringBuilder2.toString());
        System.out.print("Reverse: ");
        System.out.println(myStringBuilder2.reverse().toString());
        System.out.println("subString: " + myStringBuilder2.substring(5).toString());

    }

}

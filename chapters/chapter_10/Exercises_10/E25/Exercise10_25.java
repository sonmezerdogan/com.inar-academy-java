package chapters.chapter_10.Exercises_10.E25;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise10_25 {
    public static void main(String[] args) {
        String s = "ab#12#453";
        String regex = "#";
        String s2 = "a?b?gf#e";
        String regex2 = "[?#]";

        System.out.println("split(\"ab#12#453\",\"#\"): " + Arrays.toString(split(s, regex)));
        System.out.println("split(\"a?b?gf#e\",\"[?#]\"): " + Arrays.toString(split(s2, regex2)));
    }

    public static String[] split(String s, String regex) {
        ArrayList<String> splitList = new ArrayList<>();
        if (regex == null || regex.length() < 1) {
            return new String[]{"regex must not be null and length must be greater than 0"};
        }

        ArrayList<Character> splitters = new ArrayList<>();
        for (char ch : regex.toCharArray()) {
            if (ch == '[' || ch == ']') continue;
            splitters.add(ch);
        }
        String subString = "";
        for (int i = 0; i < s.length(); i++) {
            if (splitters.contains(s.charAt(i))) {
                if (subString.length() > 0) {
                    splitList.add(subString);
                    subString = "";
                }

                splitList.add(s.charAt(i) + "");
                i++;
                while (i < s.length()) {
                    if (!splitters.contains(s.charAt(i))) {
                        subString = subString.concat(s.charAt(i) + "");
                    } else {
                        splitList.add(subString);
                        subString = "";
                        splitList.add(s.charAt(i) + "");
                        break;
                    }
                    i++;
                }
            } else {
                subString = subString.concat(s.charAt(i) + "");
            }
        }
        if (subString.length() > 0) {
            splitList.add(subString);
        }
        return splitList.toArray(new String[]{});

    }

}

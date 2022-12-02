package chapters.chapter_12.Exercises_12.E09;

public class BinaryFormatException extends NumberFormatException {
    public BinaryFormatException(String binaryString) {
        super("Inavalid binary string " + binaryString);
    }
}

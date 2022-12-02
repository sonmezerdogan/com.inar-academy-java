package chapters.chapter_12.Listing_12;

import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("C:\\Users\\Hp\\Desktop\\scores.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Rooney V Smith ");
        output.println(80);
        output.print("Eric K Jones ");
        output.println(85);
        output.close();

    }
}

package tr.org.bura.egitim.java.chapter13.io;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFileExamples {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

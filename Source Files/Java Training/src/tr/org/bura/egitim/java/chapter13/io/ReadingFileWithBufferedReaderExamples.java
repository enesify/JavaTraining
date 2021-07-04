package tr.org.bura.egitim.java.chapter13.io;

import java.awt.desktop.SystemEventListener;
import java.io.*;

public class ReadingFileWithBufferedReaderExamples {
    public static void main(String[] args) throws IOException {
        File fileForReading = new File("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileForReading));
        while(bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}

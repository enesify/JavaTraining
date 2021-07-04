package tr.org.bura.egitim.java.chapter13.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadingFileWithScannerExamples {
    public static void main(String[] args) throws URISyntaxException {
        // reading file example -1
        //Path path = Path.of(new URI("file:///D:/users/E_BATUR/Desktop/captmidn.txt"));
        //File fileForReading = new File(path.toString());
        File fileForReading = new File("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn.txt");
        //System.out.println(fileForReading.length());
        try (Scanner fileScanner = new Scanner(fileForReading)) {
            System.out.println(fileScanner.nextLine());
            // reading through loop
            /*while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }*/

           // reading through not using loop

            fileScanner.useDelimiter("\\Z");
            System.out.println(fileScanner.next());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

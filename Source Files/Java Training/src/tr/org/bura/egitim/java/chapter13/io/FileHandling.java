package tr.org.bura.egitim.java.chapter13.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args) throws URISyntaxException {
        // -------------------------file
        //Path path = Path.of(new URI("file:///D:/users/E_BATUR/Desktop/captmidn.txt"));
        //File fileForReading = new File(path.toString());
        //String mySchool = "Istanbul \"Technical\" University";
        File fileForReading = new File("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn.txt");
        System.out.println("Is file exists: " + fileForReading.exists());
        if (fileForReading.exists()){
            System.out.println(fileForReading.getAbsoluteFile());
            System.out.println(fileForReading.getAbsolutePath());
            System.out.println(fileForReading.canRead());
        }
        else {
            try {
                if(fileForReading.createNewFile()){
                    System.out.println("File created!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        fileForReading = new File("D:\\users\\E_BATUR\\Desktop\\Java IO Examples");
        String[] filesInPath = fileForReading.list();
        //Arrays.stream(filesInPath).forEach(System.out::println);
        for (String fileName :
                filesInPath) {
            System.out.println(fileName);
        }
    }
}

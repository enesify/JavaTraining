package tr.org.bura.egitim.java.chapter13.nio;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadingOtherTypeOfFiles {
    public static void main(String[] args) throws IOException {
        //--------------------example-1 reading a pdf file and writing it to another directory------
        Path pdfFilePathForRead = Paths.get("D:\\users\\E_BATUR\\Desktop\\effective_java.pdf");
        Path pdfFilePathForWrite = Paths.get("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\effective_java34.pdf");
        byte[] pdf = Files.readAllBytes(pdfFilePathForRead);
        System.out.println(pdf.length);
        Files.write(pdfFilePathForWrite, pdf);
        //-------------------reading with java.nio api------------
        //Path readTextFile = Paths.get("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn.txt");
        //List<String> allLinesOfTextFile = Files.readAllLines(readTextFile);
        //allLinesOfTextFile.forEach(System.out::println);

        //-------------------writing with java.nio api-------------
        //Path writeTextFile = Paths.get("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn_written_with_nio.txt");
        //Files.write(writeTextFile, allLinesOfTextFile);

        //-------------------deleting with java.nio api------------
        //Path deletedFilePath = Paths.get("D:\\users\\E_BATUR\\Desktop\\Java IO Examples\\captmidn_written_with_nio.txt");
        //boolean isFileDeleted = Files.deleteIfExists(deletedFilePath);
        //System.out.println(isFileDeleted);
        
    }
}

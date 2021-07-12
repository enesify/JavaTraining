package tr.org.bura.egitim.java.chapter12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryWithResources {
    public static void main(String[] args) {
        Path filePath = Paths.get("c:/temp", "data.txt");

        try (Stream<String> lines = Files.lines(filePath))
        {

            List<String> filteredLines = lines
                    .filter(s -> s.contains("password"))
                    .collect(Collectors.toList());

            filteredLines.forEach(System.out::println);

        }
        catch (IOException e) {

            e.printStackTrace();
        }
    }

}

package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainCitire {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\userEx.txt");
        List<String> text = Files.readAllLines(path);
        for (String linie : text) {
            System.out.println(linie);
        }
    }
}

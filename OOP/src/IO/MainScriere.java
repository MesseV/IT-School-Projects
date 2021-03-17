package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainScriere {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\userEx.txt");
        List<String> text = new ArrayList<>();
        text.add("Gabriel merge la piata.");
        text.add("Gabriel merge la magazin.");
        Files.write(path, text);
    }
}

package UserManagement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    public void writeToFile (List<User> userList) throws IOException {
        List<String> text = new ArrayList<>(); //primeste lista de Users si ii transforma in string ca sa ii poata scrie in txt
        for (User user: userList) {
            String numeString = user.getNume() + " " + user.getPrenume();
            text.add(numeString);
        }
        Path path = Paths.get("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\user.txt");
        Files.write(path, text);
    }

    public List<User> readFromFile() throws IOException { //primeste o lista de string-uri si ii transforma intr-o lista de Users ca sa ii afiseze
        Path path = Paths.get("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\user.txt");
        List<String> text = Files.readAllLines(path);
        List<User> utilizatori = new ArrayList<>();
        for (String linie : text) {
            String[] parts = linie.split(" ");
            String nume = parts[0];
            String prenume = parts[1];
            User user = new User(nume, prenume);
            utilizatori.add(user);
        }
        return utilizatori;
    }
}

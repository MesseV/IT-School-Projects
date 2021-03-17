package Colete;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObjectWriter {

    public void writeObject (List<Colet> coletList) throws IOException {
        File file = new File("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\colete.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(coletList);
    }

    public List<Colet> citesteColete () throws IOException, ClassNotFoundException {
        File file = new File("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\colete.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Colet> colete = (List<Colet>) objectInputStream.readObject();
            return colete;
        }catch (Exception ex) {
            return  new ArrayList<>();
        }
    }
}

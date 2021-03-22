package Eveniment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObjectWriter {

    public void write (List<Evenimente> evenimenteList) {
        File file = new File("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\event.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(evenimenteList);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("IO exception when writing object.");
        }
    }

        public List<Evenimente> read() {
            File file = new File("E:\\Learn to Code\\GitHub\\IT-School-Projects\\inputs&outputs\\event.txt");
            List<Evenimente> evenimenteList = new ArrayList<>();

            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                evenimenteList = (List<Evenimente>) objectInputStream.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("File was not found.");
            } catch (IOException e) {
                System.out.println("IO exception when reading object.");
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found.");
            }
        return evenimenteList;
        }

}

package Eveniment;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1. Add event.");
            System.out.println("2. Show events.");
            System.out.println("3. Delete event.");
            System.out.println("4. Edit an event.");
            System.out.println("0. Exit.");
            optiune = reader.nextInt();
            reader.nextLine();
            FileObjectWriter fileObjectWriter = new FileObjectWriter();
            if (optiune == 1) {
                System.out.println("Input event name.");
                String name = reader.nextLine();
                System.out.println("Input event date.");
                String date = reader.nextLine();
                System.out.println("Input event location.");
                String location = reader.nextLine();
                Evenimente eveniment = new Evenimente(name, date, location);
                List<Evenimente> eventsFromFile = fileObjectWriter.read();
                eventsFromFile.add(eveniment);
                fileObjectWriter.write(eventsFromFile);
            } else if (optiune == 2){
                List<Evenimente> eventsFromFile = fileObjectWriter.read();
                for (Evenimente events : eventsFromFile) {
                    System.out.println(events.getName() + " " +
                                       events.getLocation() + " " +
                                       events.getDate());
                }
            } else if (optiune == 3) {
                System.out.println("Input name of event to be deleted.");
                String eventToBeDeleted = reader.nextLine();
                List<Evenimente> eventsFromFile = fileObjectWriter.read();
                for (int i = 0; i < eventsFromFile.size(); i++) {
                    Evenimente eveniment = eventsFromFile.get(i);
                    if (eveniment.getName().equals(eventToBeDeleted)) {
                        eventsFromFile.remove(eveniment);
                    }
                }
                fileObjectWriter.write(eventsFromFile);
            } else if (optiune == 4) {
                System.out.println("Input name of event to be edited.");
                String eventToBeEdited = reader.nextLine();
                System.out.println("Input the date you want to switch to.");
                String newDate = reader.nextLine();
                List<Evenimente> eventsFromFile = fileObjectWriter.read();
                for (int i = 0; i < eventsFromFile.size(); i++) {
                    Evenimente eveniment = eventsFromFile.get(i);
                    if (eveniment.getName().equals(eventToBeEdited)) {
                        eveniment.setDate(newDate);
                    }
                }
                fileObjectWriter.write(eventsFromFile);
            }
        }
    }
}

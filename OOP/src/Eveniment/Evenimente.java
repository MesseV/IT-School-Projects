package Eveniment;

import java.io.Serializable;

public class Evenimente implements Serializable {
    private String name;
    private String date;
    private String location;

    public Evenimente(String name, String data, String location) {
        this.name = name;
        this.date = data;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String nume) {
        this.name = nume;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String data) {
        this.date = data;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

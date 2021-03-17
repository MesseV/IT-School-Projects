package Colete;

import java.io.Serializable;

public class Colet implements Serializable {
    private String id;
    private String adresa;
    private String destinatar;

    public Colet(String id, String adresa, String destinatar) {
        this.id = id;
        this.adresa = adresa;
        this.destinatar = destinatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public void setDestinatar(String destinatar) {
        this.destinatar = destinatar;
    }
}

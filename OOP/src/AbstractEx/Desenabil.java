package AbstractEx;

public interface Desenabil { //nu putem avea membrii, metode normale in interface
    //putem avea metode fara corp (metode abstracte)
    void deseneaza(String colour); //nu e necesar sa scrii "public abstract void", pt ca toate sunt considerate publice si abstracte

}

package OOPstatic;

public class user {

    private static String nume; //obiectele de tip static apartin clasei - se va aplica tuturor obiectelor care o acceseaza
    //toate variabilele care o acceaseaza vor fi identice - in exemplul nostru: Gabi si Gabi
    //static se foloseste cand am o variabila care sa fie folosita de toate instantele noastre
    //ex: daca am avea un cerc si am folosi PI (3.14...) - eu vreau tot timpul PI sa fie 3.14 - asa ca voi folosi static - private static double PI = 3.14;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}

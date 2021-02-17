package OOPstatic;

public class Main {
    public static void main(String[] args) {

        user userVlad = new user();
        userVlad.setNume("Vlad");

        user userGabi = new user();
        userGabi.setNume("Gabi");

        System.out.println(userGabi.getNume() + " si " + userVlad.getNume());
    }
}

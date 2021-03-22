package exceptions.tooManyCharacters;

public class EmptyNameException extends RuntimeException { //daca facem extend la RuntimeException, nu trebuie tratata sau aruncata in main
    public EmptyNameException () {
        super("Empty name");
    }
}

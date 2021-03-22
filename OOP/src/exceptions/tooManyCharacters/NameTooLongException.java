package exceptions.tooManyCharacters;

public class NameTooLongException extends RuntimeException{ //daca facem extend la RuntimeException, nu trebuie tratata sau aruncata in main

    public NameTooLongException () {
        super("Name too long. Max 10 characters.");
    }
}

package exceptions.tooManyCharacters;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyNameException, NameTooLongException {
        if (name.length() < 4) {
            EmptyNameException emptyNameException = new EmptyNameException();
            throw emptyNameException;
        }

        if (name.length() > 12) {
            NameTooLongException nameTooLongException = new NameTooLongException();
            throw nameTooLongException;
        }
        this.name = name;
    }
}

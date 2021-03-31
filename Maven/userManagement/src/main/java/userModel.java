import javax.persistence.*;

@Entity
@Table(name = "users") //spunem ce nume sa aiba tabelul
public class userModel {

    @Id //face membrul de dedesubt cheie primara
    @GeneratedValue(strategy = GenerationType.IDENTITY) //asta face cheia de dedesupt sa faca auto increment
    private int id;
    private String firstName;
    private String lastName;

    public userModel(){
    }

    public userModel(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

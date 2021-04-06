package entities;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class bookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int pageCount;

    @ManyToOne
    private authorModel author;

    public bookModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public authorModel getAuthor() {
        return author;
    }

    public void setAuthor(authorModel author) {
        this.author = author;
    }
}

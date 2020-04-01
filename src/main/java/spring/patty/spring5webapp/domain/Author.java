package spring.patty.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by patrickskelley on Mar, 2020
 */

@Entity
public class Author {

    // since this is an entity need @Id annotation & field
    @Id // property mgmd by db i.e. id generation SQL
    @GeneratedValue(strategy = GenerationType.AUTO) // tells hybernate how it's getting generated
    private Long id;


    private String firstName;
    private String lastName;

    // many to many relationship to books, and mapped by authors
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Author(){}

    public Author(String firstName, String lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

package spring.patty.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
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

    // many to many relationship to templates.templates, and mapped by authors
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>(); //initialize hash set of templates.templates by default

    public Author(){}

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id != null ? id.equals(author.id) : author.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}

package spring.patty.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.patty.spring5webapp.domain.Author;
import spring.patty.spring5webapp.domain.Book;
import spring.patty.spring5webapp.repositories.AuthorRepository;
import spring.patty.spring5webapp.repositories.BookRepository;

/**
 * Created by patrickskelley on Apr, 2020
 when spring implements this componenet it will bring it into the spring
 context. Spring mgd commponent BootStrapData has 2 properties
 AuthorRepo & BookRepo - will do dependency injection for constructor bring instance
 of the authorrepo & bookrepo.

 implementing interface CommandLineRunner which has
 one method to implement "run."

 .

 */


// detect as spring managed component
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book book = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        // using repo methods to save objs
        // spring data JPA is using hybernate to save
        // these to in memory H2db
        authorRepository.save(eric);
        bookRepository.save(book);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "39486259");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstram");
        System.out.println("Number of books: " + bookRepository.count());


    }
}

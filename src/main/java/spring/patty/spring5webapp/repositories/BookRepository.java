package spring.patty.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.patty.spring5webapp.domain.Book;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

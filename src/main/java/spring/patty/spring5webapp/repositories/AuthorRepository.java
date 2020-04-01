package spring.patty.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.patty.spring5webapp.domain.Author;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}

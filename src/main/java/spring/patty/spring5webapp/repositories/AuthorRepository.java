package spring.patty.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.patty.spring5webapp.domain.Author;

/**
 * Created by patrickskelley on Apr, 2020
 * sets up CRUD repository. will give us
 * save, save all, find, find by id, count count by id etc
 * at run time spring data JPA will provide the implementation for us.
 * provide all methods for us to work with
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}

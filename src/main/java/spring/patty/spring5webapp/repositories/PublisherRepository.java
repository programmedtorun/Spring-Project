package spring.patty.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.patty.spring5webapp.domain.Publisher;

/**
 * Created by patrickskelley on Apr, 2020
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {


}

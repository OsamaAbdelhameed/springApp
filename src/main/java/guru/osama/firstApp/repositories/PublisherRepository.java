package guru.osama.firstApp.repositories;

import guru.osama.firstApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

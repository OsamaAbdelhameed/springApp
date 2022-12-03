package guru.osama.firstApp.repositories;

import guru.osama.firstApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

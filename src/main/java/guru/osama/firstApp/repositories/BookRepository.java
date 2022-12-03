package guru.osama.firstApp.repositories;

import guru.osama.firstApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

package guru.osama.firstApp.bootstrap;

import guru.osama.firstApp.domain.Author;
import guru.osama.firstApp.domain.Book;
import guru.osama.firstApp.domain.Publisher;
import guru.osama.firstApp.repositories.AuthorRepository;
import guru.osama.firstApp.repositories.BookRepository;
import guru.osama.firstApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Osama", "Abdelhameed");
        Book dsa = new Book("Data Structure", "0349859");
        Publisher p=new Publisher("Eric", "1 Jalan", "Los Anglos", "LA", "54093");
        eric.getBooks().add(dsa);
        dsa.getAuthors().add(eric);
        dsa.setPublisher(p);
        p.getBooks().add(dsa);

        authorRepository.save(eric);
        publisherRepository.save(p);
        bookRepository.save(dsa);

        Author rod = new Author("Rod", "Macklarin");
        Book je = new Book("J2EE", "4309542");
        rod.getBooks().add(je);
        je.getAuthors().add(rod);
        je.setPublisher(p);
        p.getBooks().add(je);

        authorRepository.save(rod);
        bookRepository.save(je);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+bookRepository.count());
        System.out.println("Number of Publishers: "+publisherRepository.count());
        System.out.println("Number of Books in this publisher: "+p.getBooks().size());
    }
}

package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
=======
/**
 * Created by jt on 12/23/19.
 */
>>>>>>> f407e7b8aeebeb621d33bfe3a1329f5a8738a310
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

<<<<<<< HEAD
        System.out.println("Started in bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publisher");
        publisher.setCity("Bangkok");
        publisher.setState("BKK");
        publisher.setZip("10100");

        publisherRepository.save(publisher);
        System.out.println("Publisher count : " + publisherRepository.count());

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Development","123123");
=======
        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
>>>>>>> f407e7b8aeebeb621d33bfe3a1329f5a8738a310
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

<<<<<<< HEAD
        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","321435453543543");
=======
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
>>>>>>> f407e7b8aeebeb621d33bfe3a1329f5a8738a310
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

<<<<<<< HEAD
        System.out.println("No. of book : " + bookRepository.count());
        System.out.println("Publisher No. of books : " + publisher.getBooks().size());
=======
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
>>>>>>> f407e7b8aeebeb621d33bfe3a1329f5a8738a310
    }
}

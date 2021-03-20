package br.com.aab.collections.sortwithcomparator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDateTime.now;
import static org.assertj.core.api.Assertions.assertThat;

public class BookServiceTest {

    private List<Book> books = new ArrayList<>();
    private BookService fixture;

    @Before
    public void setUp() throws Exception {
        books.add(new Book(1, "Java Effective", now().minusMonths(1)));
        books.add(new Book(2, "Modern Java", now().minusMonths(2)));
        books.add(new Book(3, "Elements of Programming interviews in Java", now().minusMonths(3)));
        books.add(new Book(4, "The Programmer's Brain", now().minusMonths(4)));
        books.add(new Book(5, "Spring Microservice in Action", now().minusMonths(5)));
        books.add(new Book(6, "Cracking the code interview", now().minusMonths(6)));
        books.add(new Book(7, "Design Patterns", now().minusMonths(7)));
        books.add(new Book(8, "Classic Computer Science", now().minusMonths(8)));
        fixture = new BookService(books);
    }

    @Test
    public void testGetBookByTitle() {
        List<Book> result = fixture.getBooksSortedByTitle();
        assertThat(result.get(0).getTitle()).isEqualTo("Classic Computer Science");
        assertThat(result.get(7).getTitle()).isEqualTo("The Programmer's Brain");
    }

    @Test
    public void testGetBookByPublising() {
        List<Book> result = fixture.getBooksSortedByPublishing();
        result.forEach(b -> System.out.println(b.getPublish() + " - " + b.getTitle()));
    }

    @Test
    public void testGetBookByPublisingReversed() {
        List<Book> result = fixture.getBooksSortedByPublishingReversed();
        result.forEach(b -> System.out.println(b.getPublish() + " - " + b.getTitle()));
    }

}
package br.com.aab.collections.sortwithcomparator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookService {
    private Book book;
    private List<Book> books = new ArrayList<>();

    public BookService(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooksSortedByTitle() {
        List<Book> livros = Arrays.asList(
                new Book(1, "A", LocalDateTime.now()),
                new Book(2, "B", LocalDateTime.now()));
        Comparator<Book> bookSortedByTitle = Comparator.comparing(Book::getTitle);
        books.sort(bookSortedByTitle);
        return books;
    }

    public List<Book> getBooksSortedByPublishing() {
        Comparator<Book> bookSortedByTitle = Comparator.comparing(Book::getPublish);
        books.sort(bookSortedByTitle);
        return books;
    }

    public List<Book> getBooksSortedByPublishingReversed() {
        Comparator<Book> bookSortedByTitle = Comparator.comparing(Book::getPublish).reversed();
        books.sort(bookSortedByTitle);
        return books;
    }
}

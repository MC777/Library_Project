package pl.sdac.dto;

import pl.sdac.model.Author;
import pl.sdac.model.BookType;

import java.time.LocalDate;

public class BookDto {

    private Long id;
    private String title;
    private LocalDate release;
    private String isbn;
    private String authorName;
    private BookType bookType;
    private Integer pages;
    private boolean isBorrow;
    private String borrowerName;

    public BookDto(Long bookId, String title, LocalDate release, String isbn, Author author, BookType bookType, Integer pages, boolean borrow, String summary, Author author1, Author author2) {
    }
}

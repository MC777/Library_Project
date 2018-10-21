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

    public BookDto(Long bookId, String title, LocalDate release, String isbn, String author, BookType bookType, Integer pages, boolean borrow){
        this.id = bookId;
        this.title = title;
        this.release = release;
        this.isbn = isbn;
        this.authorName = author;
        this.bookType = bookType;
        this.pages = pages;
        this.isBorrow = borrow;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
}

package pl.sda.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Book {
    private Long bookId;
    private Long authorId;
    private String title;
    private String isbn;
    private Integer pages;
    private LocalDate release;
    private String summary;
    private BookType bookType;
    private boolean isBorrow;

}

package pl.sdac.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "borrow")
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowId;

    @Column(name = "borrow_date")
    private LocalDate borrowDate;

    @Column(name = "back_date")
    private LocalDate backDate;

    @Column(name = "borrow_flag")
    private boolean borrowFlag;

    @ManyToOne
    @JoinColumn (name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn (name = "borrower_id")
    private Borrower borrower;
}

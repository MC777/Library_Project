package pl.sdac.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "borrower")
public class Borrower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowerId;

    @Column(name = "borrower_first_name", nullable = false)
    private String borrowerFirstName;

    @Column(name = "borrower_last_name", nullable = false)
    private String borrowerLastName;

    @OneToMany (mappedBy = "borrower")
    private List<Borrow> borrows;

    @OneToOne
    @JoinColumn (name = "borrower_details")
    private BorrowerDetails details;
}

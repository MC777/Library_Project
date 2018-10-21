package pl.sdac.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "borrower_details")
public class BorrowerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long borrowerDetailsId;

    @Column(name = "borrower_home_address")
    private String borrowerHomeAddress;

    @Column(name = "borrower_phone_number")
    private String borrowerPhoneNumber;

    @Column(name = "borrower_email")
    private String borrowerEmail;

    @OneToOne (mappedBy = "details")
    private Borrower borrower;
}

package pl.sdac.service;



import pl.sdac.dto.BookDto;
import pl.sdac.model.Book;
import pl.sdac.model.BookType;
import pl.sdac.repository.BookRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BookService {

    BookRepository bookRepository = new BookRepository();

    public List<BookDto> findAll(){
        List<Book> books = bookRepository.findAll();

        return books.stream()
                .map(b->{
                    String borrowName = findCurrentBorrower(b);
                   // Long borrowId = findCurrentBorrowId(b);
                    Long borrowId = null;
                    return new BookDto(b.getBookId(), b.getTitle(), b.getRelease(), b.getIsbn(), b.getAuthor(), b.getBookType(), b.getPages(), b.isBorrow(), b.getSummary(),b.getAuthor(),b.getAuthor());
                }).collect(Collectors.toList());

    }

    public List<String> findAllCategories(){
        return Arrays.stream(BookType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public void delete(Long bookId) {
    }

    private String findCurrentBorrower(Book book){
        String borrowerName = null;
//        if (book.isBorrow()){
//            Optional<Borrower> borrower = book.getBorrows().stream()
//                    .max(Coparator.comparing(Borrow::getId))
//                    .map(Borrow::getBorrower);
//            if (borrower.isPresent()){
//                borrowerName = borrower.get().getDisplayName();
//            }
//        }
        return borrowerName;
    }
}

package pl.sdac.repository;

import pl.sdac.model.Book;

import java.util.List;

public class BookRepository extends GenericRepository<Book, Long> implements IBookRepository {

    @Override
    public List<Book> findAll(){return em.createQuery("select b from Book b", Book.class).getResultList();}

    @Override
    public void save(Book book) {create(book);}

    @Override
    public Book find(Long id) {return  read(id);}

    @Override
    public void edit(Book book) {update(book);}

    @Override
    public void delete(Long id) {deleteById(id);}
}

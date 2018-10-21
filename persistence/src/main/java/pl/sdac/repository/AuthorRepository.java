package pl.sdac.repository;


import pl.sdac.model.Author;

import java.util.List;

public class AuthorRepository extends GenericRepository<Author, Long> implements IAuthorRepository {

    @Override
    public void create(Author author) {
        create(author);
    }

    @Override
    public Author find(Long id) {
        return read(id);
    }

    @Override
    public void delete(Long id) {
        deleteById(id);
    }

    @Override
    public List<Author> findAllAuthors() {
        return em.createQuery("select a from Author a", Author.class).getResultList();
    }


    @Override
    public void edit(Author author) {
        update(author);
    }

}

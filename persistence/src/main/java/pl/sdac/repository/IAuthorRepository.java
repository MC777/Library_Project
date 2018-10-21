package pl.sdac.repository;

import pl.sdac.model.Author;

import java.util.List;

public interface IAuthorRepository {

    void create(Author author);

    Author find(Long id);

    void edit(Author author);

    void delete(Long id);


    List<Author> findAllAuthors();
}

package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {


    List<Book> findAll();
    Optional<Book> findById(Long id);
    @Modifying
    void deleteBookById(Long id);










}

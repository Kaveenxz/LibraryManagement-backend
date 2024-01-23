package edu.icet.repositary;

import edu.icet.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}

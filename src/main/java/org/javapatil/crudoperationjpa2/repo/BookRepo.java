package org.javapatil.crudoperationjpa2.repo;

import org.javapatil.crudoperationjpa2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

}

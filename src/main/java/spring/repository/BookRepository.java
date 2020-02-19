package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

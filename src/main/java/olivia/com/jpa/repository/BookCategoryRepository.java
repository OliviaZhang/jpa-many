package olivia.com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olivia.com.jpa.model.BookCategory;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{

}

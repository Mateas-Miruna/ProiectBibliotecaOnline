package ro.uvt.info.splabmm1.difexample.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabmm1.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}

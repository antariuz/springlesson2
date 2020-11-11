package my.lesson.springlesson2.repository;

import my.lesson.springlesson2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(value = "SELECT MAX(id) FROM person", nativeQuery = true)
    Long getMaxId();
}

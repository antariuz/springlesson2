package my.lesson.springlesson2.repository;

import my.lesson.springlesson2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person getDriverByID(Long id);
}

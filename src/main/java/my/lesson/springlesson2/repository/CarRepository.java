package my.lesson.springlesson2.repository;

import my.lesson.springlesson2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Query(value = "SELECT MAX(id) FROM car", nativeQuery = true)
    Long getMaxId();
}

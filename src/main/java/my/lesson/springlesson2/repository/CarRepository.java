package my.lesson.springlesson2.repository;

import my.lesson.springlesson2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

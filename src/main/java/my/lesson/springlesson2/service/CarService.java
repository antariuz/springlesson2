package my.lesson.springlesson2.service;

import my.lesson.springlesson2.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCar();

    Car getCarByID(Long id);

    Long addCar(Car car);

    void updateCarByID(Car car);

    void removeCarByID(Long id);

    Long getMaxID();

}

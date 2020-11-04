package service;

import model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCar();

    Car getCarByID(Long id);

    Long addCar(Car car);

    void updateCarByID(Car car, Long id);

    void removeCarByID(Long id);

}

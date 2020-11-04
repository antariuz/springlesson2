package service.impl;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CarRepository;
import service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarByID(Long id) {
        return carRepository.getOne(id);
    }

    @Override
    public Long addCar(Car car) {
        return carRepository.save(car).getId();
    }

    @Override
    public void updateCarByID(Car car, Long id) {

    }

    @Override
    public void removeCarByID(Long id) {
        carRepository.deleteById(id);
    }

}

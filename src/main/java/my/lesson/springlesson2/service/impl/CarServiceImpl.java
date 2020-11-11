package my.lesson.springlesson2.service.impl;

import my.lesson.springlesson2.model.Car;
import my.lesson.springlesson2.repository.CarRepository;
import my.lesson.springlesson2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Long addCar(Car car) {
        return carRepository.save(car).getId();
    }

    @Override
    public void updateCarByID(Car car) {
        Car carFromDB = carRepository.findById(car.getId()).orElse(null);
        if (carFromDB != null) {
            carFromDB.setBrand(car.getBrand());
            carFromDB.setModel(car.getModel());
            carFromDB.setDriver(car.getDriver());
            carFromDB.setEngineType(car.getEngineType());
            carFromDB.setManufacturedYear(car.getManufacturedYear());
            carRepository.save(carFromDB);
        } else carRepository.save(car);
    }

    @Override
    public void removeCarByID(Long id) {
        carRepository.deleteById(id);
    }

    public Long getMaxID() {
       return carRepository.getMaxId();
    }

}

package my.lesson.springlesson2.controller;

import my.lesson.springlesson2.model.Car;
import my.lesson.springlesson2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    //GetAllPersons
    @RequestMapping(value = "/cars", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Car> getAll() {
        return carService.getAllCar();
    }

    //GetAllPersons
    @RequestMapping(value = "/car{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Car getPersonByID(@PathVariable Long id) {
        return carService.getCarByID(id);
    }

    //RemovePersonByID
    @RequestMapping(value = "/removeCar{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void removePersonByID(@PathVariable Long id) {
        carService.removeCarByID(id);
    }

    //GetMaxID
    @RequestMapping(value = "/carMaxID", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Long getMaxID() {
      return carService.getMaxID();
    }

}

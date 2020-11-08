package my.lesson.springlesson2.controller;

import my.lesson.springlesson2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import my.lesson.springlesson2.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //GetAllPersons
    @RequestMapping(value = "/persons", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Person> getAll() {
        return personService.getAllPerson();
    }

    //GetAllPersons
    @RequestMapping(value = "/person", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person getPersonByID() {
        return personService.getPersonByID(1L);
    } //ID ???

    //GetDriverByID
    @RequestMapping(value = "/driver", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person getDriverByID() {
        return getPersonByID();
    }

}

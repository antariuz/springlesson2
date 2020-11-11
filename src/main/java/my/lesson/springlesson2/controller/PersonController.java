package my.lesson.springlesson2.controller;

import my.lesson.springlesson2.model.Person;
import my.lesson.springlesson2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    //GetPerson
    @RequestMapping(value = "/person{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person getPersonByID(@PathVariable Long id) {
        return personService.getPersonByID(id);
    }

    //RemovePersonByID
    @RequestMapping(value = "/removePerson{id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public void removePersonByID(@PathVariable Long id) {
        personService.removePersonByID(id);
    }

    //GetMaxID
    @RequestMapping(value = "/personMaxID", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Long getMaxID() {
        return personService.getMaxID();
    }

    //updatePersonByID(Person person, Long id);

}

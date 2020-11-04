package service;

import model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPerson();

    Person getPersonByID(Long id);

    Long addPerson(Person person);

    void updatePersonByID(Person person, Long id);

    void removePersonByID(Long id);

    Person getDriverByID(Long id);

}

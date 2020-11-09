package my.lesson.springlesson2.service;

import my.lesson.springlesson2.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPerson();

    Person getPersonByID(Long id);

    Long addPerson(Person person);

    void updatePersonByID(Person person);

    void removePersonByID(Long id);

    Person getDriverByID(Long id);

}

package my.lesson.springlesson2.service.impl;

import my.lesson.springlesson2.model.Person;
import my.lesson.springlesson2.repository.PersonRepository;
import my.lesson.springlesson2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonByID(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public Long addPerson(Person person) {
        return personRepository.save(person).getId();
    }

    @Override
    public void updatePersonByID(Person person) {
        Person personFromDB = personRepository.findById(person.getId()).orElse(null);
        if (personFromDB != null) {
            personFromDB.setName(person.getName());
            personFromDB.setSurname(person.getSurname());
            personFromDB.setGender(person.getGender());
            personFromDB.setAge(person.getAge());
            personRepository.save(personFromDB);
        } else personRepository.save(person);
    }

    @Override
    public void removePersonByID(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public Person getDriverByID(Long id) {
        return personRepository.findById(id).orElse(null);
    }

}

package my.lesson.springlesson2.service.impl;

import my.lesson.springlesson2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import my.lesson.springlesson2.repository.PersonRepository;
import my.lesson.springlesson2.service.PersonService;

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
        return personRepository.getOne(id);
    }

    @Override
    public Long addPerson(Person person) {
        return personRepository.save(person).getId();
    }

    @Override
    public void updatePersonByID(Person person, Long id) {
//        Person existedPerson = personRepository.getOne(id);
//        existedPerson = personRepository.save(person);
    }

    @Override
    public void removePersonByID(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public Person getDriverByID(Long id) {
        return getPersonByID(id);
    }

}

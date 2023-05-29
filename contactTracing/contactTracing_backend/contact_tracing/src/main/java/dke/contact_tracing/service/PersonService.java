package dke.contact_tracing.service;

import dke.contact_tracing.entity.Person;
import dke.contact_tracing.entity.SickInformation;
import dke.contact_tracing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person savePerson(Person person) {
        return repository.save(person);
    }

    public List<Person> getPersons() {
        return repository.findAll();
    }

    public Person getPersonBySvnr(int svnr) {
        return repository.findBySvnr(svnr);
    }

    public List<Person> getPersonsBySvnr(int[] svnrs) {
        List<Person> personList = new ArrayList<>();
        Arrays.stream(svnrs).forEach(value -> personList.add(repository.findBySvnr(value)));

        return personList;
    }

    public void deletePerson(int svnr) {
        List<Person> person = repository.findAllBySvnr(svnr);
        person.stream().forEach(person1 -> repository.deleteById(person1.getId()));
    }

    public Person updatePerson(int svnr, Person person) {
        return repository
                .findById(person.getId())
                .map(value -> {
                    value.setSvnr(person.getSvnr());
                    value.setFirstName(person.getFirstName());
                    value.setLastName(person.getLastName());
                    value.setAddress(person.getAddress());
                    value.setBirthday(person.getBirthday());
                    value.setEmail(person.getEmail());
                    value.setPhoneNumber(person.getPhoneNumber());
                    value.setSickInformation(person.getSickInformation());
                    value.setContacts(person.getContacts());

                    return repository.save(value);
                })
                .orElseGet(() -> {
                    return repository.save(person);
                });
    }

    public Person updateSickInformation(int svnr, SickInformation sickInformation) {
        return repository
                .findById(svnr)
                .map(value -> {
                    value.setSickInformation(sickInformation);

                    return repository.save(value);
                })
                .orElseGet(() -> {
                    return null;
                });
    }

}

package dke.contact_tracing.service;

import dke.contact_tracing.entity.Person;
import dke.contact_tracing.entity.SickInformation;
import dke.contact_tracing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public Person getPersonBySvnr(long svnr) {
        return repository.findBySvnr(svnr);
    }

    public List<Person> getPersonsBySvnr(long[] svnrs) {
        List<Person> personList = new ArrayList<>();
        Arrays.stream(svnrs).forEach(value -> personList.add(repository.findBySvnr(value)));

        return personList;
    }

    public List<Person> getPeopleByStateAndCounty(String state, String county) {
        List<Person> personList = repository.findAll();
        return personList.stream().filter(person ->
                person.getAddress().getState().equalsIgnoreCase(state)
                && person.getAddress().getCounty().equalsIgnoreCase(county)
        ).collect(Collectors.toList());
    }

    public void deletePerson(long svnr) {
        List<Person> person = repository.findAllBySvnr(svnr);
        person.stream().forEach(person1 -> repository.deleteById(person1.getId()));
    }

    public Person updatePerson(long svnr, Person person) {
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

    public Person updateSickInformation(long svnr, SickInformation sickInformation) {
        Person person = repository.findBySvnr(svnr);

        if (person != null) {
            person.setSickInformation(sickInformation);
            return repository.save(person);
        }

        return person;

    }

    @Scheduled(cron = "0 0 6 * * *")
    public void scheduledIntervalCalculation() {
        List<Person> rooms = repository.findAll();

        if (!rooms.isEmpty()) {
            List<Person> updatedPerson = rooms.stream().map(person -> {
                SickInformation sickInformation = person.getSickInformation();

                if (sickInformation.getQuarantineEndDate().before(new Date(System.currentTimeMillis()))) {
                    sickInformation.setQuarantineStartDate(null);
                    sickInformation.setQuarantineEndDate(null);
                    sickInformation.setQuarantine(false);
                }

                person.setSickInformation(sickInformation);
                return person;
            }).collect(Collectors.toList());

            repository.saveAll(updatedPerson);
        }

    }

}

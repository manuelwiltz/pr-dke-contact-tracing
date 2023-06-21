package dke.contact_tracing;

import dke.contact_tracing.entity.Address;
import dke.contact_tracing.entity.Person;
import dke.contact_tracing.entity.SickInformation;
import dke.contact_tracing.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.sql.Date;
import java.util.ArrayList;

@SpringBootApplication
@EnableScheduling
public class ContactTracingApplication implements CommandLineRunner {

    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(ContactTracingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.deleteAll();

        Person person1 = new Person(
                6924200819L,
                "Johann",
                "Müller",
                null,
                Date.valueOf("2019-08-20"),
                "tesst@gmail.com",
                "0660123456",
                null,
                new ArrayList<>()
        );

        Person person2 = new Person(
                1449150281L,
                "Herbert",
                "Müller",
                null,
                Date.valueOf("1981-02-15"),
                "tesst24@gmail.com",
                "0660123584",
                null,
                new ArrayList<>()
        );

        personRepository.save(person1);
        personRepository.save(person2);

        Address address1 = new Address(
                "Musterstrasse",
                "3",
                "Wels-Land",
                "Upper Austria",
                "Austria"
        );

        Address address2 = new Address(
                "Musterstrasse",
                "5",
                "Linz-Land",
                "Upper Austria",
                "Austria"
        );

        SickInformation sickInformation1 = new SickInformation(
                true,
                true,
                Date.valueOf("2023-06-18"),
                Date.valueOf("2023-06-19"),
                null,
                true,
                Date.valueOf("2023-06-18"),
                Date.valueOf("2023-06-30"),
                Date.valueOf("2023-06-19"),
                false
        );

        SickInformation sickInformation2 = new SickInformation(
                true,
                true,
                Date.valueOf("2023-06-18"),
                Date.valueOf("2023-06-20"),
                null,
                true,
                Date.valueOf("2023-06-18"),
                Date.valueOf("2023-06-30"),
                Date.valueOf("2023-06-20"),
                false
        );

        person1.setAddress(address1);
        person1.setSickInformation(sickInformation1);

        person2.setAddress(address2);
        person2.setSickInformation(sickInformation2);

        personRepository.save(person1);
        personRepository.save(person2);

    }
}

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
                new Address(
                        0,
                        "Musterstrasse",
                        "3",
                        "Wels-Land",
                        "Upper Austria",
                        "Austria"
                ),
                Date.valueOf("2019-08-20"),
                "tesst@gmail.com",
                "0660123456",
                new SickInformation(
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
                ),
                new ArrayList<>()
        );

        Person person2 = new Person(
                1449150281L,
                "Herbert",
                "Müller",
                new Address(
                        1,
                        "Musterstrasse",
                        "5",
                        "Linz-Land",
                        "Upper Austria",
                        "Austria"
                ),
                Date.valueOf("1981-02-15"),
                "tesst24@gmail.com",
                "0660123584",
                new SickInformation(
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
                ),
                new ArrayList<>()
        );

        personRepository.save(person1);
        personRepository.save(person2);
    }
}

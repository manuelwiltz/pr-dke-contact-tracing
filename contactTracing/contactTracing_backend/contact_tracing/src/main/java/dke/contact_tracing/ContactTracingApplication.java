package dke.contact_tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ContactTracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactTracingApplication.class, args);
	}

}

package dke.contact_tracing.controller;

import dke.contact_tracing.entity.Person;
import dke.contact_tracing.entity.SickInformation;
import dke.contact_tracing.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "Person API", description = "API for Persons and their information and contacts")
@RestController
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/person")
    @Operation(summary = "Get a list of all persons.", description = "Returns a list of all persons.")
    public List<Person> getAllPerson() {
        return service.getPersons();
    }

    @GetMapping("/person/{svnr}")
    @Operation(summary = "Get a person by their social security number.", description = "Returns a person by their social security number.")
    public Person getPersonBySvnr(
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        return service.getPersonBySvnr(svnr);
    }

    @GetMapping("/person/{svnr}/contacts")
    @Operation(summary = "Get the contacts of a person.", description = "Returns a list of social security numbers to identify their contacts.")
    public List<String> getContactsFromPerson(
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        return service.getPersonBySvnr(svnr).getContacts();
    }

    @GetMapping("/person/{svnr}/sickinformation")
    @Operation(summary = "Get the sick information of a person.", description = "Returns the sick information of a person.")
    public SickInformation getSickInformationFromPerson(
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        return service.getPersonBySvnr(svnr).getSickInformation();
    }

    @GetMapping("/persons/{state}/{county}")
    @Operation(summary = "Get list of people by state and county.", description = "Returns a list of people by state and county.")
    public List<Person> getPeopleByStateAndCounty(
            @Parameter(description = "State (Bundesland)", example = "Upper Austria")
            @PathVariable String state,
            @Parameter(description = "County (Bezirk)", example = "Linz")
            @PathVariable String county
    ) {
        return service.getPeopleByStateAndCounty(state, county);
    }

    @GetMapping("/persons/length")
    @Operation(summary = "Get the total count of people.", description = "Returns a number containing the sum of all people.")
    public int getPeopleLength(
    ) {
        return service.getPersons().size();
    }

    @GetMapping("/persons/length/{state}/{county}")
    @Operation(summary = "Get list of people by state and county.", description = "Returns a list of people by state and county.")
    public int getTotalAmountOfPeopleByStateAndCounty(
            @Parameter(description = "State (Bundesland)", example = "Upper Austria")
            @PathVariable String state,
            @Parameter(description = "County (Bezirk)", example = "Linz")
            @PathVariable String county
    ) {
        return service.getPeopleByStateAndCounty(state, county).size();
    }

    @PutMapping("/persons/")
    @Operation(summary = "Get a list of persons by their social security numbers.", description = "Returns a list persons by their social security numbers.")
    public List<Person> getPersonsBySvnr(
            @Parameter(description = "Unique social security numbers", example = "[2345678, 43503945, 4503954]")
            @RequestBody long[] svnrs
    ) {
        return service.getPersonsBySvnr(svnrs);
    }

    @PutMapping("/person/{svnr}")
    @Operation(summary = "Update a person.", description = "Updates and returns the person.")
    public Person updatePerson(
            @RequestBody Person person,
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        return service.updatePerson(svnr, person);
    }


    @PutMapping("/person/{svnr}/sickinformation")
    @Operation(summary = "Update a persons sick information.", description = "Updates and returns the persons sick information.")
    public SickInformation updateSickInformationFromPerson(
            @RequestBody SickInformation sickInformation,
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        return service.updateSickInformation(svnr, sickInformation).getSickInformation();
    }

    @PostMapping("/person")
    @Operation(summary = "Create a person.", description = "Creates and returns a person.")
    public Person addPerson(@RequestBody Person person) {
        return service.savePerson(person);
    }

    @DeleteMapping("/person/{svnr}")
    @Operation(summary = "Delete a person.", description = "Deletes and returns the person.")
    public void deletePerson(
            @Parameter(description = "Unique social security number", example = "12345678")
            @PathVariable long svnr
    ) {
        service.deletePerson(svnr);
    }

}

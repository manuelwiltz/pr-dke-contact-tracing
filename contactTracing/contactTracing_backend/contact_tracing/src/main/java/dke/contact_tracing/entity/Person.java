package dke.contact_tracing.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;

    private long svnr;

    private String firstName;
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private String email;
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private SickInformation sickInformation;

    @ElementCollection
    private List<String> contacts;

    public Person() {
    }

    public Person(
            long svnr, String firstName, String lastName, Address address, Date birthday, String email,
            String phoneNumber, SickInformation sickInformation, List<String> contacts
    ) {
        this.svnr = svnr;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.sickInformation = sickInformation;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSvnr() {
        return svnr;
    }

    public void setSvnr(long id) {
        this.svnr = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SickInformation getSickInformation() {
        return sickInformation;
    }

    public void setSickInformation(SickInformation sickInformation) {
        this.sickInformation = sickInformation;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "svnr=" + svnr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sickInformation=" + sickInformation +
                ", contacts=" + contacts +
                '}';
    }
}

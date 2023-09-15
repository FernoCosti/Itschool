package session9.Homework.CollegeManagementSystem;

import java.time.LocalDate;

public class Professors {
    private String firstName;
    private String lastName;
    private String cnp;
    private String address;
    private int age;
    private char sex;
    private LocalDate dateOfBirth;

    public Professors(String firstName, String lastName, String cnp, String address, String age, char sex, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.address = address;
        this.age = Integer.parseInt(age);
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
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

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Professors{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
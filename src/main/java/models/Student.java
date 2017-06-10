package models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Created by Joey on 10-6-2017.
 */

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Email
    private String email;

    private String studentNumber;

    private String firstName;

    @NotEmpty
    private String lastName;

    @NotNull
    private Role role;

    public Student() {}

    public Student(String studentNumber, String firstName, String lastName, String email) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Role getRole() {
        return role;
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

    public String getStudentName() {
        return this.firstName + this.lastName;
    }

    @Override
    public String toString() {
        return getStudentName();
    }
}

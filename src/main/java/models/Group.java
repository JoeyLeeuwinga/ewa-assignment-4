package models;

import org.hibernate.validator.constraints.NotEmpty;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;


/**
 * Created by Joey on 10-6-2017.
 */

@Entity
public class Group {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    @NotNull
    private String name;

    private Integer year;

    private ArrayList<Student> students;


    public Group() {}

    public Group(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

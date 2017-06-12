package models;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


/**
 * Created by Joey on 10-6-2017.
 */

@XmlRootElement
public class Group {

    private Integer id;
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

package models;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Joey on 10-6-2017.
 */

@XmlRootElement
public class Subject {

    private Integer id;
    private String name;
    private Integer year;


    public Subject() {}

    public Subject(String name, int year) {
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
}

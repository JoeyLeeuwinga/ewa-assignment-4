package models;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Created by Joey on 10-6-2017.
 */

@XmlRootElement
public class Role {

    private static final String STUDENT = "STUDENT";
    private static final String TEACHER = "ROLE_STAFF";
    private Integer id;
    private String name;

    public Role() {
    }

    public Role(String role) {
        this.name = role;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

}

package controllers;

import models.Student;
import services.StudentService;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Joey on 9-6-2017.
 */
@Path("/students")
public class StudentController {
    @Inject
    private StudentService studentService;

    @GET
    @Produces("application/json")
    public JsonArray getAll() {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for (Student student : studentService.getAll()) {
            builder.add(Json.createObjectBuilder().add("studentNumber", student.getStudentNumber()));
        }
        return builder.build();
    }
}

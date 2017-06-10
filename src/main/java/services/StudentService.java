package services;

import models.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Joey on 9-6-2017.
 */
@Stateless
public class StudentService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Student> getAll() {
        TypedQuery<Student> query = entityManager.createQuery("select s from Student s", Student.class);
        return query.getResultList();

    }
}

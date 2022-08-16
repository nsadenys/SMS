package jpa.service;



import jpa.entitymodels.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

import java.util.List;

public class CourseService {
    private EntityManager em;
    public CourseService() {
        // set this to use the correct persistance unit from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
        em = emf.createEntityManager();
    }

    public List<Course> getAllCourses(){
        try {
            String sql = "SELECT c FROM course c";

            // set this to use the correct entity
            TypedQuery<Course> query = em.createQuery(sql, Course.class);


            List<Course> courses = query.getResultList();

            return courses;
        } catch (Exception e) {
            return null;
        }
    }
}

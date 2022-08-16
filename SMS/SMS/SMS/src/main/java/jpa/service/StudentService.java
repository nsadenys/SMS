package jpa.service;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;


import javax.persistence.*;
import java.util.List;


public class StudentService implements StudentDAO {

    private EntityManager em;

    public StudentService() {
        // set this to use the correct persistance unit from persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMS");
        em = emf.createEntityManager();
    }
    @Override
    public List<Student> getAllStudents(){

        try {
            String sql = "SELECT s FROM student s";

            // set this to use the correct entity
            TypedQuery<Student> query = em.createQuery(sql, Student.class);


            List<Student> students = query.getResultList();

            return students;
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public Student getStudentByEmail(String email){
        try {
            String sql = "SELECT s FROM student s where email = :email";

            // set this to use the correct entity
            TypedQuery<Student> query = em.createQuery(sql, Student.class);
            query.setParameter("email", email);

            Student student = query.getSingleResult();

            return student;
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public boolean validateStudent(String email, String password){

        try {
            String sql = "SELECT s FROM student s where email = :email AND password = :password";

            // set this to use the correct entity
            TypedQuery<Student> query = em.createQuery(sql, Student.class);
            query.setParameter("email", email);
            query.setParameter("password", password);

            Student student = query.getSingleResult();
            if (student != null){
                return true;

            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }
    @Override
    public void registerStudentToCourse(String sEmail, int cId){
        try {
            String sql = "SELECT s.student_email FROM student_course s where student_email = :email AND sCourses_id = :cid";

            // set this to use the correct entity
            TypedQuery<String> query = em.createQuery(sql, String.class);
            query.setParameter("email", sEmail);
            query.setParameter("cid", cId);

            String student = query.getSingleResult();
            if (student == null){
                String sqlSave = "INSERT INTO student_course VALUES (:student_email, :sCourses_id)";

                // set this to use the correct entity
                Query query1 = em.createQuery(sqlSave);
                query.setParameter("student_email", sEmail);
                query.setParameter("sCourses_id", cId);

                em.getTransaction().begin();
                int recordsUpdated = query.executeUpdate();
                em.getTransaction().commit();

            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
    @Override
    public List<Course> getStudentCourses(String sEmail){
        try {
            String sql = "SELECT c.id, c.name, c.instructor FROM course c JOIN student_course s ON c.id = s.sCourses_id WHERE s.student_email = :email";

            // set this to use the correct entity
            TypedQuery<Course> query = em.createQuery(sql, Course.class);


            List<Course> courses = query.getResultList();

            return courses;
        } catch (Exception e) {
            return null;
        }
    }


}

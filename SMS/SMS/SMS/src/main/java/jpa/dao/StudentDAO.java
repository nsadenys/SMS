package jpa.dao;



import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

import java.util.List;


public interface StudentDAO {

    public List<Student> getAllStudents();

    Student getStudentByEmail(String email);

    boolean validateStudent(String email, String password);

    void registerStudentToCourse(String sEmail, int cId);

    List<Course> getStudentCourses(String sEmail);
}

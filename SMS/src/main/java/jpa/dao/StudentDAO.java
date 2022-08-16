package jpa.dao;



import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

import java.util.List;


public interface StudentDAO {
// interface student Dao, the proper method signature based on the Service 
    public List<Student> getAllStudents();

    Student getStudentByEmail(String email);

    boolean validateStudent(String email, String password);

    void registerStudentToCourse(String sEmail, int cId);

    List<Course> getStudentCourses(String sEmail);
}

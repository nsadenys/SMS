package jpa.dao;



import jpa.entitymodels.Course;

import java.util.List;
//interfece courseDao
public interface CourseDAO {


    List<Course> getAllCourses();
}

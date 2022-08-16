package jpa.dao;

import jpa.entitymodels.Course;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseDAOTest {

    @Test
    void getAllCourses() {
        Course course = new Course(1, "English", "Anderea Scamaden");
        Assert.assertEquals("Anderea Scamaden", course.getcInstructorName());
    }
}
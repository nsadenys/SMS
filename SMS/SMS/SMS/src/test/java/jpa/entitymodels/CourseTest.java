package jpa.entitymodels;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseTest {

    @Test
    void getcId() {
        Course course = new Course(1, "English", "Anderea Scamaden");
        assertEquals(1, course.getcId());
    }
    @Test
    void getcName() {
        Course course = new Course(1, "English", "Anderea Scamaden");
        assertEquals("English", course.getcName());
    }
    @Test
    void getcInstructorName() {
        Course course = new Course(1, "English", "Anderea Scamaden");
        Assert.assertEquals("Anderea Scamaden", course.getcInstructorName());
    }


}
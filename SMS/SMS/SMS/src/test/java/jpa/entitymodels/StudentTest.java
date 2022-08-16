package jpa.entitymodels;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

class StudentTest {

    @Test
    void getsEmail() {
        Student student = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j", Collections.singletonList("English"));
        Assert.assertEquals("aiannitti7@is.gd", student.getsEmail());
    }

    @Test
    void getsName() {
        Student student = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j", Collections.singletonList("English"));
        assertEquals("Alexandra Iannitti", student.getsName());
    }

    @Test
    void getsPass() {
        Student student = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j", Collections.singletonList("English"));
        assertEquals("TWP4hf5j", student.getsPass());
    }

    @Test
    void getsCourses() {
        Student student = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j", Collections.singletonList("English"));
        assertEquals(Collections.singletonList("English"), student.getsCourses());
    }

}
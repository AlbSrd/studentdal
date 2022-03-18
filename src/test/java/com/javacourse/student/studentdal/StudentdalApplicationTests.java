package com.javacourse.student.studentdal;

import com.javacourse.student.studentdal.entities.Student;
import com.javacourse.student.studentdal.repos.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

    @Autowired
    private StudentRepo repo;

    @Test
    void testCreateStudent() {
        Student student = new Student();
        student.setName("alberto");
        student.setCourse("End to End JAVA SPRING");
        student.setFee(13d);
        repo.save(student);
    }
    
}

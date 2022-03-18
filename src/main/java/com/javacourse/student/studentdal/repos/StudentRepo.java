package com.javacourse.student.studentdal.repos;

import com.javacourse.student.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
}

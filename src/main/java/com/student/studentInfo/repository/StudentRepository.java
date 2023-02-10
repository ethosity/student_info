package com.student.studentInfo.repository;

import com.student.studentInfo.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {


    @Query(value = "select te.teacher_id, te.first_name, ba.batch_id from teacher te\n" +
            "inner join subject su on te.subject_id = su.subject_id\n" +
            "inner join batch ba on te.batch_id = ba.batch_id",
            nativeQuery = true)
    Map<String, Object>  getTeacherDetails();
}

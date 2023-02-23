package com.student.studentInfo.repository;

import com.student.studentInfo.entity.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {


    @Query(value = "SELECT DISTINCT SUBJECT_ID, SUBJECT_NAME FROM SUBJECT",
            nativeQuery = true)
    List<Subject> getSubjectList();
}

package com.student.studentInfo.repository;

import com.student.studentInfo.entity.GlobalTeacher;
import com.student.studentInfo.entity.Student;
import com.student.studentInfo.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TeacherRepository extends CrudRepository<GlobalTeacher, Long> {

    /*@Query(value = "select te.* from teacher te\n" +
            "inner join subject su on te.subject_id = su.subject_id\n" +
            "inner join batch ba on te.batch_id = ba.batch_id",
            nativeQuery = true)
    Map<String, Object>  getTeacherDetails();*/

    @Query(value = "select t.TEACHER_ID , t.TEACHER_NAME, s.SUBJECT_NAME,\n" +
            "c.CITY_NAME, l.LOCATION_NAME, c2.CLASS_NAME  \n" +
            "from GLOBAL_TEACHER t \n" +
            "inner join subject s on \n" +
            "t.SUBJECT_ID_LEVEL_1 = s.SUBJECT_ID \n" +
            "inner join city c on\n" +
            "t.CITY_ID_LEVEL_1 = c.CITY_ID \n" +
            "inner join location l on \n" +
            "t.LOCATION_ID_LEVEL_1 = l.LOCATION_ID \n" +
            "inner join class c2 on\n" +
            "t.CLASS_ID_LEVEL_1 = c2.CLASS_ID \n" +
            "where s.SUBJECT_NAME = :SUBJECT_NAME\n" +
            "or c.CITY_NAME = :CITY_NAME\n" +
            "or l.LOCATION_NAME = :LOCATION_NAME\n" +
            "or c2.CLASS_NAME = :CLASS_NAME",
            nativeQuery = true)
    List<GlobalTeacher> getTeacherInfo(@Param("CITY_NAME") String city, @Param("SUBJECT_NAME") String subject,
                                 @Param("CLASS_NAME") String className, @Param("LOCATION_NAME") String location);
}

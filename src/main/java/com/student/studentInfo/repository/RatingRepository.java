package com.student.studentInfo.repository;

import com.student.studentInfo.entity.Rating;
import com.student.studentInfo.entity.Subject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Long> {


    @Query(value = "SELECT DISTINCT TEACHER_ID ,RATING_VALUE FROM RATING",
            nativeQuery = true)
    List<Rating> getRatingList();
}

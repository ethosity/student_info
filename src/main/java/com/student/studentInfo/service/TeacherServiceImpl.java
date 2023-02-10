package com.student.studentInfo.service;

import com.student.studentInfo.constant.Constant;
import com.student.studentInfo.entity.GlobalTeacher;
import com.student.studentInfo.exception.TeacherNotFoundException;
import com.student.studentInfo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService{

    TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository){

        this.teacherRepository = teacherRepository;
    }

    /**
     * @param params
     * @return
     */
    @Override
    public Map<String, Object> getTeacherInfo(Map<String, Object> params) {
        Map<String, Object> map = null;
                //teacherRepository.getTeacherDetails();
        return map;
    }

    /**
     * @param params
     * @return
     */
    @Override
    public Map<String, Object> getTeacherInfo1(Map<String, Object> params) {
        Map<String, String> mapParams = new HashMap<>();
        mapParams.put("CITY",params.get(Constant.CITY_NAME).toString());
        mapParams.put("SUBJECT",params.get(Constant.SUBJECT_NAME).toString());
        mapParams.put("CLASS",params.get(Constant.CLASS_NAME).toString());
        mapParams.put("LOCATION",params.get(Constant.LOCATION_NAME).toString());
        List<GlobalTeacher> map =
                teacherRepository.getTeacherInfo(mapParams.get("CITY"),
                        mapParams.get("SUBJECT"), mapParams.get("CLASS"), mapParams.get("LOCATION"));
        if(map.isEmpty()){
            throw new TeacherNotFoundException("Search not found. Try redefine search.");
        }
        Map<String, Object> kk = new HashMap<>();
        kk.put("teacher", map);
        return kk;
        }
}

//Search not found. Try redefine search.
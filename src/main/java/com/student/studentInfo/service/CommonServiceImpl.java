package com.student.studentInfo.service;

import com.student.studentInfo.api.request.Response;
import com.student.studentInfo.entity.Rating;
import com.student.studentInfo.entity.Subject;
import com.student.studentInfo.model.RatingDTO;
import com.student.studentInfo.model.SubjectDTO;
import com.student.studentInfo.repository.RatingRepository;
import com.student.studentInfo.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CommonServiceImpl implements CommonService {

    SubjectRepository subjectRepository;

    RatingRepository ratingRepository;

    /**
     * @return
     */
    @Override
    public Response getSubjectList() {
        Response response = new Response();
        Map<String, Object> map = new HashMap<>();
        List<SubjectDTO> subjectDTOList = getSubjectDTOList(subjectRepository.getSubjectList());
        map.put("subject",subjectDTOList);
        response.setData(map);
        return response;
    }

    /**
     * @return
     */
    @Override
    public Response getRatingList() {
        Response response = new Response();
        Map<String, Object> map = new HashMap<>();
        List<RatingDTO> ratingDTOList = getRatingDTOList(ratingRepository.getRatingList());
        map.put("rating",ratingDTOList);
        response.setData(map);
        return response;
    }

    private List<SubjectDTO> getSubjectDTOList(List<Subject> subjectList) {
        List<SubjectDTO> subjectDTOList = subjectList.stream().map(name -> {
                    SubjectDTO sub = new SubjectDTO();
                    sub.setSubjectName(name.getSubjectName());
                    return sub;
                }
        ).collect(Collectors.toList());
        return subjectDTOList;
    }

    private List<RatingDTO> getRatingDTOList(List<Rating> ratingList) {
        List<RatingDTO> ratingDTOList = ratingList.stream().map(rat -> {
            RatingDTO rating = new RatingDTO();
            rating.setValue(rat.getValue());
                    return rating;
                }
        ).collect(Collectors.toList());
        return ratingDTOList;
    }

    /*public Response subjectList(){
        Response response = new Response();
        Map<String, Object> map = new HashMap<>();
        List<SubjectDTO> subjectDTOList = getSubjectList();
        response.setData((Map<String, Object>) map.put("data",subjectDTOList));
        return response;
    }*/
}

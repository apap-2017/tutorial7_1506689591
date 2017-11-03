package com.example.dao;

import com.example.model.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CourseDAOImpl implements CourseDAO {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public CourseModel selectCourse (String id)
    {
        CourseModel course =
                restTemplate.getForObject(
                        "http://localhost:8080/rest/course/view/"+id,
                        CourseModel.class);
        return course;
    }

    @Override
    public List<CourseModel> selectAllCourses ()
    {
        List<CourseModel> courses =
                restTemplate.getForObject(
                        "http://localhost:8080/rest/course/viewall",
                        List.class);
        return courses;
    }
}

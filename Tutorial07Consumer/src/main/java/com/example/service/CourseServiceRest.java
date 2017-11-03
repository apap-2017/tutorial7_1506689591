package com.example.service;

import com.example.dao.CourseDAO;
import com.example.model.CourseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService {

    @Autowired
    private CourseDAO courseDAO;

    @Override
    public CourseModel selectCourse (String id)
    {
        log.info ("REST - select student with npm {}", id);
        return courseDAO.selectCourse(id);
    }

    @Override
    public List<CourseModel> selectAllCourses ()
    {
        log.info ("select all students");
        return courseDAO.selectAllCourses();
    }
}

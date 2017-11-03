package com.example.dao;

import com.example.model.CourseModel;

import java.util.List;

public interface CourseDAO {
    CourseModel selectCourse (String id);
    List<CourseModel> selectAllCourses ();
}

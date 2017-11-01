package com.example.service;

import com.example.model.CourseModel;

import java.util.List;

public interface CourseService
{
    CourseModel selectCourse(String id);
    List<CourseModel> selectAllCourses ();
}

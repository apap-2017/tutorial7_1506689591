package com.example.dao;

import com.example.model.CourseModel;
import com.example.model.StudentModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CourseMapper
{
    @Select("select id_course, name, credits from course where id_course = #{id}")
    @Results(value = {
            @Result(property="idCourse", column="id_course"),
            @Result(property="name", column="name"),
            @Result(property="credits", column="credits"),
            @Result(property="students", column="id_course",
                    javaType = List.class,
                    many=@Many(select="selectStudents"))
    })
    CourseModel selectCourse(@Param("id") String id);

    @Select("select student.npm, student.name " +
            "from studentcourse join student " +
            "on studentcourse.npm = student.npm " +
            "where studentcourse.id_course = #{id}")
    List<StudentModel> selectStudents(@Param("id") String id);
}

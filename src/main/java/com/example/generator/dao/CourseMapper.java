package com.example.generator.dao;

import com.example.generator.model.Course;
import java.util.List;

public interface CourseMapper {
    int insert(Course record);

    List<Course> selectAll();
}
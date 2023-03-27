package com.example.generator.dao;

import com.example.generator.model.course;
import java.util.List;

public interface courseMapper {
    int insert(course record);

    List<course> selectAll();
}
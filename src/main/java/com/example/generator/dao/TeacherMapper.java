package com.example.generator.dao;

import com.example.generator.model.Teacher;
import java.util.List;

public interface TeacherMapper {
    int insert(Teacher record);

    List<Teacher> selectAll();
}
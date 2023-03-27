package com.example.generator.dao;

import com.example.generator.model.Student;
import java.util.List;

public interface StudentMapper {
    int insert(Student record);

    List<Student> selectAll();
}
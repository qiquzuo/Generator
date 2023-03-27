package com.example.generator.dao;

import com.example.generator.model.student;
import java.util.List;

public interface studentMapper {
    int insert(student record);

    List<student> selectAll();
}
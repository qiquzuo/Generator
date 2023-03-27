package com.example.generator.dao;

import com.example.generator.model.teacher;
import java.util.List;

public interface teacherMapper {
    int insert(teacher record);

    List<teacher> selectAll();
}
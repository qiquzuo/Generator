package com.example.generator.dao;

import com.example.generator.model.score;
import java.util.List;

public interface scoreMapper {
    int insert(score record);

    List<score> selectAll();
}
package com.example.generator.dao;

import com.example.generator.model.Score;
import java.util.List;

public interface ScoreMapper {
    int insert(Score record);

    List<Score> selectAll();
}
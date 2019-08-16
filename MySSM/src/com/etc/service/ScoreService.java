package com.etc.service;

import java.util.List;

import com.etc.entity.Score;

public interface ScoreService {
	/**查询成绩列表*/
	List<Score> listScore();
	
	/**添加学生考试信息*/
	int addScore(Score score);
}

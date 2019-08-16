package com.etc.dao;

import java.util.List;

import com.etc.entity.Score;



/**成绩接口*/
public interface ScoreDaoMapper {
	/**查询成绩列表*/
	List<Score> listScore();
	
	/**添加学生考试信息*/
	int addScore(Score score);

}

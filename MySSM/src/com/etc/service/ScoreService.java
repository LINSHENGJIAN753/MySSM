package com.etc.service;

import java.util.List;

import com.etc.entity.Score;

public interface ScoreService {
	/**��ѯ�ɼ��б�*/
	List<Score> listScore();
	
	/**���ѧ��������Ϣ*/
	int addScore(Score score);
}

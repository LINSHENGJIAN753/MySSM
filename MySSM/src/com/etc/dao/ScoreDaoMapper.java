package com.etc.dao;

import java.util.List;

import com.etc.entity.Score;



/**�ɼ��ӿ�*/
public interface ScoreDaoMapper {
	/**��ѯ�ɼ��б�*/
	List<Score> listScore();
	
	/**���ѧ��������Ϣ*/
	int addScore(Score score);

}

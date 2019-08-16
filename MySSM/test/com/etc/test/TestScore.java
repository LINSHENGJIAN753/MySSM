package com.etc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etc.entity.Score;
import com.etc.service.ScoreService;

public class TestScore {

	/** ��ѯȫ���ɼ����� */

	public void listScore() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ScoreService scoreService = (ScoreService) ctx.getBean("scoreService");
		List<Score> list = scoreService.listScore();
		for (Score item : list) {
			System.out.println(item.getId() + "\t" + item.getName());
		}
		ctx.close();
	}

	/** ��ӳɼ����� */
	@Test
	public void addScroe() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		ScoreService scoreService = (ScoreService) ctx.getBean("scoreService");
		Score score = new Score(0, "test", 9887, 100, 100, 100, 100);
		int result = scoreService.addScore(score);
		System.out.println("��ӳɼ������" + result);
		ctx.close();

	}

}

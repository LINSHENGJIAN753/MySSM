package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.etc.dao.ScoreDaoMapper;
import com.etc.entity.Score;
import com.etc.service.ScoreService;


@Service("scoreService")
@Transactional
public class ScoreServiceImpl implements ScoreService {
	
	@Resource
	private ScoreDaoMapper scoreDaoMapper;

	@Override
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Score> listScore() {
		return scoreDaoMapper.listScore();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int addScore(Score score) {
		return scoreDaoMapper.addScore(score);
	}

}

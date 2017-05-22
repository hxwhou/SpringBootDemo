package com.ibm.cruise.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cruise.dao.IScoreDao;
import com.ibm.cruise.entity.Score;
import com.ibm.cruise.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {
	
	@Autowired
	private IScoreDao scoreDao;

	@Override
	public List<Score> getScoreList() throws Exception {
		
		return scoreDao.getScoreList();
	}

	@Override
	public void updateScoreById(float score, int id) throws Exception {
		scoreDao.updateScoreById(score, id);
	}

	@Override
	public int deleteScoreById(int id) throws Exception {
		return scoreDao.deleteScoreById(id);
	}

}

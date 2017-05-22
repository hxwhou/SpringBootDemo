package com.ibm.cruise.service;

import java.util.List;

import com.ibm.cruise.entity.Score;

public interface ScoreService {
	
	List<Score> getScoreList() throws Exception;

	void updateScoreById(float score, int id) throws Exception;

	int deleteScoreById(int id) throws Exception;
	
}

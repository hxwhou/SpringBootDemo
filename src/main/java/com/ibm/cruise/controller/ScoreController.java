package com.ibm.cruise.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cruise.entity.Score;
import com.ibm.cruise.service.ScoreService;

@RestController
@RequestMapping("rest/score")
public class ScoreController {
	
	private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);
	
	@Autowired
	private ScoreService scoreService;
	
	@RequestMapping("/list")
	public List<Score> getScoreList() throws Exception{
		logger.info("从数据库读取Score表数据");
		return scoreService.getScoreList();
	}
	
	@RequestMapping("/update")
	public void updateScoreById() throws Exception{
		logger.info("更新Score表中的数据");
		scoreService.updateScoreById(88.8f, 2);
	}
	
	@RequestMapping("/delete")
	public int deleteScoreById() throws Exception{
		logger.info("删除Score表中的指定数据");
		return scoreService.deleteScoreById(1);
	}

}

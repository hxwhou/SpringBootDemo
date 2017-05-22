package com.ibm.cruise.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibm.cruise.entity.Score;

@Repository
public interface IScoreDao extends CrudRepository<Score, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Score t set t.score = :score where t.id = :id")
	int updateScoreById(@Param("score") float score, @Param("id") int id);
	
	@Query("select t from Score t")
	List<Score> getScoreList();
	
	@Transactional
	@Modifying
	@Query("delete from Score t where t.id= :id")
	int deleteScoreById(@Param("id") int id);
}

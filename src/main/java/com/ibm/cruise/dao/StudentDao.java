package com.ibm.cruise.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.cruise.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Student> getStudentList() throws Exception {
		String sql = "SELECT ID, NAME, SCORE_SUM, SCORE_AVG, AGE FROM TP_STUDENT";
		return jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("ID"));
				student.setAge(rs.getInt("AGE"));
				student.setName(rs.getString("NAME"));
				student.setSumScore(rs.getString("SCORE_SUM"));
				student.setAvgScore(rs.getString("SCORE_AVG"));
				return student;
			}

		});
	}
}

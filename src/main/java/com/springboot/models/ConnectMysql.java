package com.springboot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class ConnectMysql {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "SELECT * FROM models";
	
	public void querySql(){
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		System.out.println(list);
	}
	
}

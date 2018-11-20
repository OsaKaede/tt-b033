package com.cacei.version1.utils;

// Mínimos necesarios
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;

public class AwesomeStoredProcedure extends StoredProcedure {
	public AwesomeStoredProcedure(JdbcTemplate jdbcTemplate, String name) {
		super(jdbcTemplate, name);
		setFunction(false);
	}
}
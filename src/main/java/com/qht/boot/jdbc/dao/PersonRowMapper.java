package com.qht.boot.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.qht.boot.jdbc.model.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Person person = new Person(rs.getLong(1),
				rs.getString(2), rs.getString(3), rs.getDouble(4));
		
		return person;
	}

}

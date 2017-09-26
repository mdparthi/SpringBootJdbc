package com.qht.boot.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.qht.boot.jdbc.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Person getPerson(long id) {
		String query = "select * from person where id=?";
		return template.queryForObject(query, new Object[] {id}, new PersonRowMapper());
	}

	@Override
	public List<Person> getPersonList() {
		String query = "select * from person";
		return template.query(query, new PersonRowMapper());
	}

	@Override
	public void addPerson(Person person) {
		String query = "insert into person values(?,?,?,?)";
		template.update(query, new Object[] {5, "Joe", "John", 456.45D});
		
	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(long id) {
		// TODO Auto-generated method stub
		
	}

}

package com.qht.boot.jdbc.dao;

import java.util.List;

import com.qht.boot.jdbc.model.Person;

public interface PersonDAO {
	public Person getPerson(long id);
	public List<Person> getPersonList();
	public void addPerson(Person person);
	public void updatePerson(Person person);
	public void deletePerson(long id);

}

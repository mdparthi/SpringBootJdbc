package com.qht.boot.jdbc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qht.boot.jdbc.dao.PersonDAO;
import com.qht.boot.jdbc.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDAO dao;
	
	public Person findBypersonId(long id) {
		if(id==0) {
			System.out.println("Id cannot be 0");
		}else {
			return  dao.getPerson(id);
		}
		return null;
	}
}

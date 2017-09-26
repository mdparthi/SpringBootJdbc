package com.qht.boot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qht.boot.jdbc.model.Person;
import com.qht.boot.jdbc.service.PersonService;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		PersonService personService = context.getBean(PersonService.class);
		Person person = personService.findBypersonId(1);
		System.out.println(person.getFirstName() + " " + person.getLastName());
	}
}

package com.cavalier.spring.service;

import java.util.List;

import com.cavalier.spring.model.Person;
///////////////////interface design pattern////////////////////////
public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}

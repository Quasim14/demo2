package com.example.demo2.beans;



import com.example.demo2.repositories.PersonRepository;
import com.example.demo2.entities.Person;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class PersonBean implements Serializable {
    @Inject
    private PersonRepository personRepository;

    private List<Person> persons;

    @PostConstruct
    public void init(){
        persons = personRepository.findAll();
        System.out.println("ddd");
    }

    public List<Person> getPersons(){
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}

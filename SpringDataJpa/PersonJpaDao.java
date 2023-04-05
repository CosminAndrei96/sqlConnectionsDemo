package com.example.demo.SpringDataJpa;

import com.example.demo.Hibernate.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonJpaDao extends CrudRepository<Person, Integer> {
   List<Person> findAllByNume(String nume);

}

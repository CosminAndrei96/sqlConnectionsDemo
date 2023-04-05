package com.example.demo.SpringDataJpa;

import com.example.demo.Hibernate.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SpringDataJpaController {
    @Autowired
    PersonJpaDao personJpaDao;

    @GetMapping("/selectjpa")
    @ResponseBody
    public List<Person> selectPerson(){
        //select din bd
        return (List<Person>) personJpaDao.findAll();

    }
    @GetMapping("/insertjpa")
    @ResponseBody
    public String insertPerson(){
        //insert din bd
        Person p = new Person();
        p.setNume("Matei");
        p.setPrenume("Vlad");
        personJpaDao.save(p);
        return "s-a facut insert cu succes";
    }
}

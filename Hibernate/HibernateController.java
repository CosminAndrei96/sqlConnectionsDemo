package com.example.demo.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HibernateController {
    @Autowired
    PersonDao personDao;

    @GetMapping("/selectHibernate")
    @ResponseBody
    public List<Person> selectPerson(){
        //select din bd
        return personDao.selectPerson();

    }
    @GetMapping("/insertHibernate")
    @ResponseBody
    public String insertPerson(){
        //insert din bd
        personDao.save("Popescu", "Maria");
        return "s-a facut insert cu succes";
    }
}

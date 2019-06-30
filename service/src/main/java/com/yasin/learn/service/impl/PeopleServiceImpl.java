package com.yasin.learn.service.impl;

import com.yasin.learn.service.PeopleService;
import com.yasin.learn.service.dao.PeopleDAO;
import com.yasin.learn.service.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 17:33
 * @desc:
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDAO peopleDAO;

    @Override
    public People getPeople(Integer id) {

        System.out.printf("service代码已经执行\n");

        return peopleDAO.select(id);
    }

    @Override
    public void insert(Integer id) {
        System.out.printf("service代码已经执行\n");

        People people = new People();
        people.setId(id);
        people.setName("yasin");

        peopleDAO.insert(people);
    }
}


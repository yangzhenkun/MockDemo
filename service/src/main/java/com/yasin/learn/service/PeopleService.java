package com.yasin.learn.service;

import com.yasin.learn.service.entity.People;

public interface PeopleService {

    People getPeople(Integer id);

    void insert(Integer id);

}

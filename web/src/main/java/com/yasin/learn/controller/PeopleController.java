package com.yasin.learn.controller;

import com.yasin.learn.service.PeopleService;
import com.yasin.learn.service.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 17:19
 * @desc:
 */
@RestController
@RequestMapping(value = "/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/get")
    public People getPeople(Integer id) {

        System.out.printf("web代码已经执行\n");
        return peopleService.getPeople(id);

    }

}

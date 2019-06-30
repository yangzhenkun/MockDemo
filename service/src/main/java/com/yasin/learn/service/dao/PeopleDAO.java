package com.yasin.learn.service.dao;

import com.yasin.learn.service.Util.Utils;
import com.yasin.learn.service.entity.People;
import org.springframework.stereotype.Service;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 17:36
 * @desc:
 */
@Service
public class PeopleDAO {

    public void insert(People people) {

        System.out.printf("执行插入...\n DAO层获取的返回值:" + Utils.util());


    }

    public People select(Integer id) {

        System.out.printf("执行查询...\n");


        People people = new People();
        people.setId(id);
        people.setName("yasin");

        return people;
    }


}

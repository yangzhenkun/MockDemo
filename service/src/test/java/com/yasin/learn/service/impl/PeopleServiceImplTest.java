package com.yasin.learn.service.impl;

import com.yasin.learn.service.dao.PeopleDAO;
import com.yasin.learn.service.entity.People;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * 对serviceImpl进行单测
 *
 * @author: yangzhenkun
 * @create: 2019-06-25 17:55
 * @desc:
 */
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "org.apache.cxf.*", "com.amazonaws.*", "javax.net.ssl.*", "com.sun.crypto.*", "javax.crypto.*", "sun.security.*", "javax.jws.*", "sun.security.provider.*", "javax.security.*"})
public class PeopleServiceImplTest {

    @Before
    public void beforeClass() {
        MockitoAnnotations.initMocks(this);
    }

    @InjectMocks
    private PeopleServiceImpl peopleService;
    @Mock
    private PeopleDAO peopleDAO;


    /**
     * 简单单测
     */
    @Test
    public void getPeople() {
        People people = new People();
        people.setName("单测注入的");

        Mockito.when(peopleDAO.select(Mockito.anyInt())).thenReturn(people);

        System.out.printf(peopleService.getPeople(1).toString());
    }

    /**
     * 对void方法进行mock
     */
    @Test
    public void insert() {

        PowerMockito.doNothing().when(peopleDAO).insert((People) Mockito.any());

        peopleService.insert(1);

    }

}

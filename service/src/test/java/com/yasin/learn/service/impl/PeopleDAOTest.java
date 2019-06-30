package com.yasin.learn.service.impl;

import com.yasin.learn.service.Util.Utils;
import com.yasin.learn.service.dao.PeopleDAO;
import com.yasin.learn.service.entity.People;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 18:55
 * @desc:
 */
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "org.apache.cxf.*", "com.amazonaws.*", "javax.net.ssl.*", "com.sun.crypto.*", "javax.crypto.*", "sun.security.*", "javax.jws.*", "sun.security.provider.*", "javax.security.*"})
@PrepareForTest({Utils.class})
public class PeopleDAOTest {

    @Before
    public void beforeClass() {
        MockitoAnnotations.initMocks(this);
        PowerMockito.mockStatic(Utils.class);

    }

    @InjectMocks
    private PeopleDAO peopleDAO;


    /**
     * 对静态方法进行mock
     */
    @Test
    public void insert() {

        PowerMockito.when(Utils.util()).thenReturn("dc");

        peopleDAO.insert(new People());

    }


}

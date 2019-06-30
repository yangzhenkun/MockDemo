package com.yasin.learn.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 18:42
 * @desc: 启动spring环境进行单测
 * <p>
 * 有些时候需要启用spring环境，例如读取yaml文件和mybatis Example相关的单测
 * 增加两个注解即可
 *
 * 注意：spring bean管理容器和PoweMock注入生成的bean不是同一个环境。一般的单测是不需要启用spring的环境
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@PowerMockIgnore({"javax.management.*", "org.apache.cxf.*", "com.amazonaws.*", "javax.net.ssl.*", "com.sun.crypto.*", "javax.crypto.*", "sun.security.*", "javax.jws.*", "sun.security.provider.*", "javax.security.*"})
public class PeopleServiceImplSpringTest {


    @Before
    public void beforeClass() {
        MockitoAnnotations.initMocks(this);
    }

    @Autowired
    private PeopleServiceImpl peopleService;


    /**
     * 简单单测
     */
    @Test
    public void getPeople() {

        System.out.printf(peopleService.getPeople(1).toString());
    }


}

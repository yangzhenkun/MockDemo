package com.yasin.learn.web;

import com.yasin.learn.controller.PeopleController;
import com.yasin.learn.service.PeopleService;
import com.yasin.learn.service.entity.People;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author: yangzhenkun
 * @create: 2019-06-25 19:13
 * @desc:
 */
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "org.apache.cxf.*", "com.amazonaws.*", "javax.net.ssl.*", "com.sun.crypto.*", "javax.crypto.*", "sun.security.*", "javax.jws.*", "sun.security.provider.*", "javax.security.*"})
public class PeopleControllerTest {

    @InjectMocks
    private PeopleController peopleController;
    @Mock
    private PeopleService peopleService;

    private MockMvc mockMvc;

    @Before
    public void beforeClass() {
        /**
         * 必须有，初始化mock环境
         */
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(peopleController).build();
    }

    /**
     * mvc测试
     */
    @Test
    public void getPeople() {

        People people = new People();
        people.setId(2);
        people.setName("web单测");

        Mockito.when(peopleService.getPeople(Mockito.anyInt())).thenReturn(people);

        try {
            mockMvc.perform(
                    MockMvcRequestBuilders.get("/people/get").param("id", "1")
            ).andDo(MockMvcResultHandlers.print());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

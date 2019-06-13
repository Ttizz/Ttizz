package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-service.xml", "classpath*:applicationContext-mapper.xml");
        ItemService bean = app.getBean(ItemService.class);
        System.out.println(bean.findById(1));
    }
}

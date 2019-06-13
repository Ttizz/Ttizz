package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-mapper.xml");
        ItemMapper itemMapper = app.getBean(ItemMapper.class);
        Items mapper = itemMapper.findById(1);
        System.out.println(mapper.getName());
    }
}

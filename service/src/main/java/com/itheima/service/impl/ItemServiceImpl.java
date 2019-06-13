package com.itheima.service.impl;

import com.itheima.domain.Items;
import com.itheima.mapper.ItemMapper;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemMapper itemMapper;
    public Items findById(Integer id) {
        return itemMapper.findById(id);
    }
}

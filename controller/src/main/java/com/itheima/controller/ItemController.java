package com.itheima.controller;


import com.itheima.domain.Items;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/find")
    public String findItemDetail(Model model){
        Items items = itemService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}

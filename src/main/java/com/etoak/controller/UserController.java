package com.etoak.controller;

import com.etoak.bean.Page;
import com.etoak.bean.User;
import com.etoak.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 19161 on 2020/8/18.
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/toReg")
    public String toRegPage() {
        return "user/reg";
    }

    @GetMapping("/toLog")
    public String toRegLogin() {
        return "user/log";
    }


    @PostMapping("/add")
    public String add(User user){
        userService.addUser(user);
        return "redirect:/user/toReg";
    }
    @















    @GetMapping("/toList")
    public String toList(){return "user/list";}


    @GetMapping(value = "list",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Page<User>queryList(
               @RequestParam(required = false,defaultValue = "1")int pageNum,
               @RequestParam(required = false,defaultValue = "5")int pageSize,
                               User user
                               ){
        log.info("pageNum - {}, pageSize - {}, houseVo - {}, rentalList- {}", pageNum, pageSize,user);
        return userService.queryList(pageNum,pageSize,user);
    }
    @GetMapping(value = "list2",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Page<User>queryList2(
            @RequestParam(required = false,defaultValue = "1")int pageNum,
            @RequestParam(required = false,defaultValue = "5")int pageSize,
            User user
    ){
        log.info("pageNum - {}, pageSize - {}, houseVo - {}, rentalList- {}", pageNum, pageSize,user);
        return userService.queryList(pageNum,pageSize,user);
    }






    //@PutMapping("/update")
    @RequestMapping("/update")
    public String update(User user){
        log.info("user - {}", user);
        userService.updateUser(user);
        return  "redirect:/user/toList";
    }
}

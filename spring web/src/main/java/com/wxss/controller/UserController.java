package com.wxss.controller;

import com.wxss.entity.User;
import com.wxss.service.UserService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package: com.wxss.controller
 * @author: JQWang
 * @version: 1.0.0
 * @since: 1.0.0
 */
@RestController
@RequestMapping("/user")
//@Slf4j
public class UserController {
    private static final Logger LOG   = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User get(@PathVariable("id") Long id){
        LOG.info("com.wxss.controller.UserController.get接收请求:{}",id);

        User one = userService.findOne(id);
        return one;
    }
}

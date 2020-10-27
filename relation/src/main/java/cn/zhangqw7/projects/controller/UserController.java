package cn.zhangqw7.projects.controller;

import cn.zhangqw7.projects.model.User;
import cn.zhangqw7.projects.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://192.168.100.111:8080")
    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id){
        return userService.queryUserById(id);
    }
}

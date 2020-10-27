package cn.zhangqw7.projects.conbiner.controller;

import cn.zhangqw7.projects.conbiner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("conbiner/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public User queryUserById(@RequestParam("id") Long id){
        return this.restTemplate.getForObject("http://localhost:8081/user/" + id, User.class);
    }
}

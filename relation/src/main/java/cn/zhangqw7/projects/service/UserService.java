package cn.zhangqw7.projects.service;

import cn.zhangqw7.projects.mapper.UserMapper;
import cn.zhangqw7.projects.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);
    }

}

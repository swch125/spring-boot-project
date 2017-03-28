package com.serviceImpl;

import com.domain.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Eric.sun on 2017/3/23.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User addUserWithBackId(String loginname, String age){
        User user = new User();
        user.setName(loginname);
        user.setAge(age);
        userMapper.insertUserWithBackId(user);//该方法后，主键已经设置到user中了
        return user;
    }

    @Override
    public User getUserInfo(String loginname) {
        User user = new User();
        user.setName(loginname);
        return  userMapper.getUserInfo(user);//该方法后，主键已经设置到user中了
    }
}

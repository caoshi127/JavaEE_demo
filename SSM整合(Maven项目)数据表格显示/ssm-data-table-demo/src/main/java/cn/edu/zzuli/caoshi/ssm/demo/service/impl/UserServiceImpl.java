package cn.edu.zzuli.caoshi.ssm.demo.service.impl;

import cn.edu.zzuli.caoshi.ssm.demo.domain.User;
import cn.edu.zzuli.caoshi.ssm.demo.mapper.UserMapper;
import cn.edu.zzuli.caoshi.ssm.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CaoShi on 2020/2/7 10:04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> listUser() {

        List<User> userList = userMapper.selectAllUser();
        // System.out.println("UserServiceImpl.listUser  ----- " + userList);
        return userList;
    }
}

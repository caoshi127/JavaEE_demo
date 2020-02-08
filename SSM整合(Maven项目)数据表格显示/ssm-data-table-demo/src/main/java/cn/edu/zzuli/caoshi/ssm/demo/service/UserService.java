package cn.edu.zzuli.caoshi.ssm.demo.service;

import cn.edu.zzuli.caoshi.ssm.demo.domain.User;

import java.util.List;

/**
 * Created by CaoShi on 2020/2/7 10:02
 */
public interface UserService {


    /**
     * 获取所有用户
     * @return
     */
    List<User> listUser();


}

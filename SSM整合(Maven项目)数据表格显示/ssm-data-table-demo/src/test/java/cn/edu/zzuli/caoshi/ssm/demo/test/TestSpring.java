package cn.edu.zzuli.caoshi.ssm.demo.test;

import cn.edu.zzuli.caoshi.ssm.demo.domain.User;
import cn.edu.zzuli.caoshi.ssm.demo.mapper.UserMapper;
import cn.edu.zzuli.caoshi.ssm.demo.service.UserService;
import cn.edu.zzuli.caoshi.ssm.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by CaoShi on 2020/2/7 14:15
 */
public class TestSpring {

    @Test
    public void test0() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        List<User> userList = userMapper.selectAllUser();
        System.out.println(userMapper);
        System.out.println(userList);

    }


}

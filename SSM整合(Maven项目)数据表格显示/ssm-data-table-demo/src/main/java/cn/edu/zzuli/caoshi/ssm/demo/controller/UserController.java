package cn.edu.zzuli.caoshi.ssm.demo.controller;

import cn.edu.zzuli.caoshi.ssm.demo.domain.User;
import cn.edu.zzuli.caoshi.ssm.demo.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by CaoShi on 2020/2/6 21:28
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView) {
        List<User> userList = userService.listUser();
        // System.out.println("UserController.list     " + userList);
        modelAndView.addObject("userList", userList);

        String jsonUserList = JSON.toJSONString(userList);
        modelAndView.addObject("jsonUserList", jsonUserList);

        modelAndView.setViewName("/user/userList");
        return modelAndView;
    }


    @RequestMapping(value = "/layui", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public String testLayUI() {
        List<User> userList2 = userService.listUser();
        String jsonUserList2 = JSON.toJSONString(userList2);
        // System.out.println("UserController.testLayUI        " + jsonUserList2);
        return jsonUserList2;
    }

}

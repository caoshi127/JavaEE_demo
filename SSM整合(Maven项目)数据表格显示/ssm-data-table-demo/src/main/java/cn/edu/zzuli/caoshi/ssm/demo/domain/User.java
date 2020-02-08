package cn.edu.zzuli.caoshi.ssm.demo.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by CaoShi on 2020/2/6 21:29
 */
@Data
@ToString
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

    private Date birthday;


}

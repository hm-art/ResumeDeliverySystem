package com.school.register.controller;

import com.school.register.mapper.RegisterMapper;
import com.school.register.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author hanmiao11133
 * @description
 * @date 2020/2/17
 */
@Controller
@RequestMapping(value = "/register")
public class Test {
    @Resource
    private RegisterMapper registerMapper;

    @ResponseBody
    @RequestMapping(value = "/select")
    public String select(){
        Register register = registerMapper.selectByPrimaryKey(1);
        String s = "hello!<br/>";
        if(register != null) {
            s += "username:" + register.getUsername() + ",password:" + register.getPassword();
        }
        return s;
    }
}

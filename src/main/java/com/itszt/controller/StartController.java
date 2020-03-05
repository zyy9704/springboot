package com.itszt.controller;

import com.itszt.domain.JsonResult;
import com.itszt.domain.Student;
import com.itszt.domain.User;
import com.itszt.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zyy on 2020/2/19.
 */
@RestController
public class StartController {
    @Resource
    private StudentService studentService;
    @RequestMapping("/springboot")
    public Student startSpringBoot() {

        return studentService.queryStudent("1");
    }

    @RequestMapping("/json")
    public Student json() {
        Student s=new Student();
        s.setName(null);
        s.setAge("12");
        return s;
    }

    @RequestMapping("/user")
    public JsonResult<User> getUser() {
        User user = new User((long) 1, "倪升武", "123456");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User((long) 1, "倪升武", "123456");
        User user2 = new User((long) 2, "达人课", "123456");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User((long) 1, "倪升武", null);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new JsonResult<>(map);
    }
}

package com.itszt.service.impl;

import com.itszt.domain.Student;
import com.itszt.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * Created by zyy on 2020/2/19.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public Student queryStudent(String id) {
        Student s=new Student();
        s.setAge("12");
        s.setName("张三");

        return s;
    }
}

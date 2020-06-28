package com.ssm.swagger.controller;

import com.ssm.swagger.entity.Dept;
import com.ssm.swagger.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/findAll")
    public List<Dept> findAll() {
        return deptService.findAll();
    }
}

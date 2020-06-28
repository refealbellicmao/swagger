package com.ssm.swagger.mapper;

import com.ssm.swagger.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    public List<Dept> findAll();
}

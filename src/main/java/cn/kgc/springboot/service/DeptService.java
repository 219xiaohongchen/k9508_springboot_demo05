package cn.kgc.springboot.service;

import cn.kgc.springboot.entity.Dept;

import java.util.List;

/**
 *   部门业务层接口
 */
public interface DeptService {

    //查询所有部门数据
    List<Dept> findAllDept() throws Exception;
}

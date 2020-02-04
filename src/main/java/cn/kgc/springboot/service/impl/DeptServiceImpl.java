package cn.kgc.springboot.service.impl;

import cn.kgc.springboot.entity.Dept;
import cn.kgc.springboot.mapper.DeptMapper;
import cn.kgc.springboot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  部门的业务层实现类
 */
@Service
@Transactional(readOnly = false)
public class DeptServiceImpl implements DeptService {

    //依赖注入部门Mapper代理对象
    @Autowired
    private DeptMapper deptMapper;

    //查询所有部门数据
    @Override
    public List<Dept> findAllDept() throws Exception {
        return deptMapper.selAllDept();
    }
}

package cn.kgc.springboot.service.impl;

import cn.kgc.springboot.entity.Emp;
import cn.kgc.springboot.mapper.EmpMapper;
import cn.kgc.springboot.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *   员工业务层实现类
 */
@Service
@Transactional(readOnly = false)
public class EmpServiceImpl implements EmpService {

    //依赖注入员工Mapper代理对象
    @Autowired
    private EmpMapper empMapper;

    //查询所有员工及其部门数据
    @Override
    public List<Emp> findAllEmpAndSelDept() throws Exception {
        return empMapper.selAllEmpAndSelDept();
    }

    //根据员工编号删除员工数据
    @Override
    public String removeEmpByEmpno(Integer empno) throws Exception {
        if(empMapper.delEmpByEmpno(empno)>0){
            return "success";
        }else {
            return "fail";
        }
    }

    //根据员工编号查询单个员工数据
    @Override
    public Emp findEmpByEmpno(Integer empno) throws Exception {
        return empMapper.selEmpByEmpno(empno);
    }

    //根据条件分页查询数据
    @Override
    public PageInfo<Emp> findPageEmpByPramas(Integer page, Integer limit, Emp emp) throws Exception {
        PageHelper.startPage(page,limit);
        return new PageInfo<Emp>(empMapper.selAllEmpAndSelDept());
    }

    //修改员工数据
    @Override
    public String updEmp(Emp emp) throws Exception {
        if(empMapper.updEmp(emp)>0){
            return "success";
        }else {
            return "fail";
        }
    }

    //添加员工数据
    @Override
    public String saveEmp(Emp emp) throws Exception {
        if(empMapper.insEmp(emp)>0){
            return "success";
        }else {
            return "fail";
        }
    }
}

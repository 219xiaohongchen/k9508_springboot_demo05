package cn.kgc.springboot.service;

import cn.kgc.springboot.entity.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 *   员工业务层接口
 */
public interface EmpService {

    //查询所有员工及其部门数据
    List<Emp> findAllEmpAndSelDept() throws Exception;

    //根据员工编号删除员工数据
    String removeEmpByEmpno(Integer empno) throws Exception;

    //根据员工编号查询单个员工数据
    Emp findEmpByEmpno(Integer empno) throws Exception;

    //根据条件分页查询数据
    PageInfo<Emp> findPageEmpByPramas(Integer page, Integer limit, Emp emp) throws Exception;

    //修改员工数据
    String updEmp(Emp emp) throws Exception;

    //添加员工数据
    String saveEmp(Emp emp) throws Exception;

}

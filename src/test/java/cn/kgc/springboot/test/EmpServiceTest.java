package cn.kgc.springboot.test;

import cn.kgc.springboot.entity.Emp;
import cn.kgc.springboot.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 *   员工业务层测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmpServiceTest {

    @Autowired
    private EmpService empService;

    //日志对象
    private static final Logger log = Logger.getLogger(EmpServiceTest.class);

    //测试查询所有
    @Test
    public void test01(){
        try {
            List<Emp> emps = empService.findAllEmpAndSelDept();
            for (Emp emp:emps) {
                log.info(emp.getEmpno()+"\t"+emp.getEname());
                log.info("---------------------");
                log.info(emp.getDept());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //测试分页查询
    @Test
    public void test02(){
        try {
            PageInfo<Emp> pageInfo = empService.findPageEmpByPramas(1,3,new Emp());
            List<Emp> emps = pageInfo.getList();
            for (Emp emp:emps) {
                log.info(emp.getEmpno()+"\t"+emp.getEname());
                log.info("---------------------");
                log.info(emp.getDept());
            }
            log.info("共有："+pageInfo.getTotal()+"条数据。。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

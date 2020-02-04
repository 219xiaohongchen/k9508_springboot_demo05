package cn.kgc.springboot.entity;

import java.io.Serializable;
import java.util.List;

/**
 *  部门实体对象
 */
public class Dept implements Serializable {

    //部门编号
    private Integer deptno;
    //名称
    private String dname;
    //地址
    private String loc;

    //员工集合
    private List<Emp> emps;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}

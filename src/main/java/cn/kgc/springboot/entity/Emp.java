package cn.kgc.springboot.entity;

import java.util.Date;

/**
 *   员工实体对象
 */
public class Emp {

    //编号
    private Integer empno;
    //姓名
    private String ename;
    //工作
    private String job;
    //工资
    private Double sal;
    //上司编号
    private Integer mgr;
    //入职时间
    private Date hiredate;
    //奖金
    private Double comm;
    //部门编号
    private Integer deptno;

    //部门实体对象
    private Dept dept;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}

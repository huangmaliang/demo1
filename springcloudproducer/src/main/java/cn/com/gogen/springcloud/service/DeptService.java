package cn.com.gogen.springcloud.service;

import cn.com.gogen.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {

    public void addDept(Dept dept);

    public Dept findOne(Long deptno);

    public List<Dept> findAll();

    public void update(Dept dept);

    public void delDept(Long deptno);
}

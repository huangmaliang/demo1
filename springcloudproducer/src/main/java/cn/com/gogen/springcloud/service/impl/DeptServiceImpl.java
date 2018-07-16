package cn.com.gogen.springcloud.service.impl;

import cn.com.gogen.springcloud.entity.Dept;
import cn.com.gogen.springcloud.mapper.DeptMapper;
import cn.com.gogen.springcloud.service.DeptService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Service
@RestController
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    @RequestMapping(value = "/dept/del/{id}", method = RequestMethod.DELETE)
    public void delDept(@PathVariable("id") Long deptno) {
        deptMapper.deleteByPrimaryKey(deptno);
    }

    @Override
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public void addDept(@RequestBody Dept dept) {
        deptMapper.insert(dept);
    }

    @Override
    @RequestMapping(value = "/dept/findone/{id}", method = RequestMethod.GET)
    public Dept findOne(@PathVariable("id") Long deptno) {
        Dept dept = deptMapper.selectByPrimaryKey(deptno);
        return dept;
    }

    @Override
    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    public List<Dept> findAll() {
        List<Dept> depts = deptMapper.selectByExample(null);
        return depts;
    }

    @Override
    @RequestMapping(value = "/dept/update", method = RequestMethod.PUT)
    public void update(@RequestBody Dept dept) {
        deptMapper.updateByPrimaryKeySelective(dept);
    }
}

package cn.com.gogen.springcloud.controller;

import cn.com.gogen.springcloud.entity.Dept;
import cn.com.gogen.springcloud.feign.DeptClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Api(tags = "主机全量拉取")
@RestController
public class DeptConsumer {
    @Autowired
    private DeptClientService deptService;

    @GetMapping(value = "/consumer/findAll")
    @ApiOperation(value = "主机全量拉取权限信息",httpMethod = "GET")
    public List<Dept> getAll(){
       return deptService.findAll();
    }

    @GetMapping(value = "/consumer/findOne/{id}")
    @ApiOperation(value = "主机全量拉取权限信息",httpMethod = "GET")
    public Dept getOne(@PathVariable("id") Long deptno){
        return deptService.findOne(deptno);
    }

    @PostMapping(value = "/consumer/add")
    @ApiOperation(value = "主机全量拉取权限信息",httpMethod = "POST")
    public void addDept(@RequestBody Dept dept){
        deptService.addDept(dept);
    }

    @DeleteMapping(value = "/consumer/del/{id}")
    @ApiOperation(value = "主机全量拉取权限信息",httpMethod = "DELETE")
    public void delDept( @PathVariable("id") Long deptno){
        deptService.delDept(deptno);
    }

    @PutMapping("/consumer/update")
    @ApiOperation(value = "主机全量拉取权限信息",httpMethod = "PUT")
    public void update(@RequestBody Dept dept){
        deptService.updateDept(dept);
    }
}

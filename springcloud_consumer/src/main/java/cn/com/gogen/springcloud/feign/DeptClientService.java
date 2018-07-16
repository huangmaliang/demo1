package cn.com.gogen.springcloud.feign;

import cn.com.gogen.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MYSPRINGCLOUD-DEPT")
public interface DeptClientService {
    @RequestMapping(value = "/dept/add" ,method = RequestMethod.POST)
    public void addDept(@RequestBody Dept dept);


    @RequestMapping(value = "/dept/findAll" ,method = RequestMethod.GET)
    public List<Dept> findAll();

    @RequestMapping(value = "/dept/findone/{id}" ,method = RequestMethod.GET)
    public Dept findOne(@PathVariable("id") Long deptno);


    @RequestMapping(value = "/dept/del/{id}" ,method = RequestMethod.DELETE)
    public void delDept(@PathVariable("id") Long deptno);


    @RequestMapping(value = "/dept/update" ,method = RequestMethod.PUT)
    public void updateDept(@RequestBody Dept dept);
}

package com.ctpower.springcloud.controller;

import com.ctpower.springcloud.pojo.Dept;
import com.ctpower.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.controller
 * @date 2021/2/25 18:44
 * @Copyright www.ctpower.com
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return this.deptClientService.queryAll();
    }

}
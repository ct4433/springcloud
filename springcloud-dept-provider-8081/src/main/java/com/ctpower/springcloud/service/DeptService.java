package com.ctpower.springcloud.service;

import com.ctpower.springcloud.pojo.Dept;

import java.util.List;

/**
* @Package com.ctpower.springcloud.service
* @author ctpower
* @date 2021/2/26 21:00
* @version V1.0
* @Copyright www.ctpower.com
*/public interface DeptService {

    Dept queryById(Long id);

    List<Dept> queryAll();

    boolean addDept(Dept dept);
}

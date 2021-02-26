package com.ctpower.springcloud.service;

import com.ctpower.springcloud.dao.DeptDao;
import com.ctpower.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.service
 * @date 2021/2/25 15:56
 * @Copyright www.ctpower.com
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {

        return deptDao.queryById(id);
    }


    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}

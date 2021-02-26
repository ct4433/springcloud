package com.ctpower.springcloud.dao;

import com.ctpower.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ctpower
 * @version V1.0
 * @Package com.ctpower.springcloud.dao
 * @date 2021/2/25 15:56
 * @Copyright www.ctpower.com
 */

@Mapper
@Repository
public interface DeptDao {


    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();



}

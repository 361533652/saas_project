package com.itheima.dao.company;

import com.itheima.domain.company.Company;

import java.util.List;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
public interface CompanyDao {
    /**
     * 查询列表
     * @return  Company列表
     */
    List<Company> findAll();
}

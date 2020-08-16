package com.itheima.service.company.impl;

import com.itheima.dao.company.CompanyDao;
import com.itheima.domain.company.Company;
import com.itheima.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyDao companyDao;

    @Autowired
    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public List<Company> findAll() {
        return companyDao.findAll();
    }
}

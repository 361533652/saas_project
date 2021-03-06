package com.itheima.dao.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class CompanyDaoTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test() {
        System.out.println(companyDao.findAll());
    }

}

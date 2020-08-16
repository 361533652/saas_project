package com.itheima.service.company;

import com.itheima.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
//在测试方法中不能含有有参构造方法！
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

    @Test
    public void test() {
        final List<Company> all = companyService.findAll();
        System.out.println(companyService.getClass());
        for (Company company : all) {
            System.out.println("company = " + company);
        }
    }
}

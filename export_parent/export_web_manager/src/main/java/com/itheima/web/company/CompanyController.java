package com.itheima.web.company;

import com.itheima.domain.company.Company;
import com.itheima.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author Create by Tong Day on 2020/8/16
 */
@Controller
@RequestMapping("/user")
public class CompanyController {
    private CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    /**
     * 查找所有企业信息
     * @return 返回modelAndView对象
     */
    @RequestMapping("/list")
    public ModelAndView list() {
        final List<Company> companyList = companyService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",companyList);
        modelAndView.setViewName("company/company-list");
        return modelAndView;
    }
    /**
     *   测试异常
     */
    @RequestMapping("/testDate")
    public String testDate(Date date, HttpServletRequest request){
        //模拟异常
        //int a = 5/0;
        if (date==null){
            request.setAttribute("errorMsg","格式错误！请重试！");
            return "forward:/WEB-INF/pages/error.jsp";
        }
        System.out.println(date);
        return "success";
    }
}

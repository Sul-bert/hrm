package com.sulbert.company;

import com.sulbert.company.mapper.CompanyMapper;
import com.sulbert.company.entity.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Author: Sulbert
 * Date: 2020/5/19
 * Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CompanyDaoTest {

    @Resource
    private CompanyMapper companyMapper;

    @Test
    public void test(){
        Company company = companyMapper.selectById("123");
        System.out.println(company);
    }
}
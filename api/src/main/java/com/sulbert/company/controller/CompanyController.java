package com.sulbert.company.controller;

import com.sulbert.company.mapper.CompanyMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: Sulbert
 * Date: 2020/5/28
 * Description:
 */
@RestController
@RequestMapping("company")
public class CompanyController {

    @Resource
    private CompanyMapper companyMapper;

    @RequestMapping("hello")
    public String hello(){
        return "hello hrm";
    }

}
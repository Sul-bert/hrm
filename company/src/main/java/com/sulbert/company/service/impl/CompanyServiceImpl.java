package com.sulbert.company.service.impl;

import com.sulbert.company.entity.Company;
import com.sulbert.company.mapper.BaseMapper;
import com.sulbert.company.mapper.CompanyMapper;
import com.sulbert.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Sulbert
 * Date: 2020/6/5
 * Description:
 */
@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    BaseMapper<Company> getMapper(){
        return companyMapper;
    }

    @Override
    public void save(Company company) {
        super.save(company);
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);
    }

    @Override
    public void updateById(Company t) {
        super.updateById(t);
    }

    @Override
    public Company get(String id) {
        return super.get(id);
    }

}
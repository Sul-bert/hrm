package com.sulbert.company.service;

import com.sulbert.company.entity.Company;

public interface CompanyService extends BaseService<Company> {

    void save(Company company);

    void deleteById(String id);

    void updateById(Company company);

    Company get(String Id);
}

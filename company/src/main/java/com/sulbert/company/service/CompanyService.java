package com.sulbert.company.service;

import com.sulbert.company.entity.Company;

public interface CompanyService extends BaseService<Company> {

    void save(Company company);

    void delete(String id);

    void update(Company company);

    Company get(String Id);
}

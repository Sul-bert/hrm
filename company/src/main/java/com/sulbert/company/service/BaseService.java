package com.sulbert.company.service;

import com.sulbert.company.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

    void save(T t);

    void deleteById(String id);

    void updateById(T t);

    T get(String Id);

}

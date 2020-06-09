package com.sulbert.company.service;

import com.sulbert.company.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {

    void save(T t);

    void delete(String id);

    void update(T t);

    T get(String Id);

}

package com.sulbert.company.mapper;

import com.sulbert.company.entity.BaseEntity;

/**
 * Author: Sulbert
 * Date: 2020/6/5
 * Description:
 */
public interface BaseMapper<T extends BaseEntity> {

    void insert(T t);

    void delete(String id);

    void update(T t);

    T select(String id);
}